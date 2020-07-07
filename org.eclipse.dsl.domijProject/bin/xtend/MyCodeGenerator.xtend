package xtend


import org.eclipse.emf.common.util.URI
//import org.eclipse.emf.ecore.EPackage
//import org.eclipse.emf.ecore.resource.Resource$Factory$Registry
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EPackage
import domijProject.DomijProjectPackage
import domijProject.Model
import domijProject.ProcessStep
import domijProject.Error
import org.eclipse.emf.common.util.EList
import java.io.FileWriter
import java.io.File
import java.io.IOException
import java.io.PrintStream

//import org.eclipse.xtext.generator.IFileSystemAccess2

class MyCodeGenerator {
	
	FileWriter fw
	File file
	CharSequence cs 
	char[] htmlCode
	
	def static void main(String[] args) {
    new MyCodeGenerator().generate("../../runtime-ErrorHandler3/test/My.domijproject")
  }

  def generate(String file) {
    doEMFSetup
    val resourceSet = new ResourceSetImpl
    val resource = resourceSet.getResource(URI.createURI(file), true)
    var model = resource.allContents.toIterable.filter(Model).get(0);
	
	 //file = new File(new URI("file:///C:/Users/User/Desktop/Eclipse-DOMIJ\workspace_domij\org.eclipse.dsl.domijProject\xtend-gen\xtend\Model.html"))
	 try{	
	 	//file = new File("file:///C:/Users/User/Desktop/Eclipse-DOMIJ/workspace_domij/org.eclipse.dsl.domijProject/xtend-gen/xtend/Model.html")
	 	//fw = new FileWriter(file,true)
	 	//println(createHTMLtable(model))
	 	//fw.write(createHTMLtable(model))
	 	
	 	//fw.append(createHTMLtable(model))
	 	//fw.close()
	 	println(createHTMLtable(model))
	 	val fout = new PrintStream(new File("Model.html"))
        fout.println(createHTMLtable(model))
        fout.close
	 }catch(IOException e) {
	 	e.printStackTrace()
	 }
	 

  }
  def createHTMLtable(Model model) '''
		<!DOCTYPE html>
		<html>
		<style>
		table {
			width: 100%;
			border-collapse:collapse;
			border:none;
			font-family:"Times New Roman","sans-serif";
			text-align:center;
		}
		th, td {
		 border: 1pt solid windowtext;
		 padding: 5px;
		}
		td.sign {
			width: 10%;
			font-size: 150%;
		}
		.header {
			background-color: #f2f2f2;
		}
		</style>
		<body>
		
		<table>
		<tr>
			<td> Process step </td>
			<td> Error </td>
			<td> Effect </td>
			<td> Cause </td>
			<td> Severity [1-10] </td>
			<td> Handler </td>
		</tr>
			«FOR man : model.processing»
				«FOR element : man.elements»
					
					«IF element instanceof ProcessStep»
						«FOR e : element.errors»
						<tr>
							<td> «element.name» </td>
							<td> «e.name» </td>
							<td> «e.effect» </td>
							<td> «e.cause» </td>
							<td> «e.severityOfError» </td>
							«IF e.globalerrorhandler != null»
							<td> GLOBAL: «e.globalerrorhandler.name» </td>
							«ELSE»<td> LOCAL: Starts with step: «e.errorLink.name» </td>
							«ENDIF»
						</tr>
						«ENDFOR»
					«ENDIF»
					
				«ENDFOR»
			«ENDFOR»
		
		</table>
		</body>
		</html> 	
  '''



  def doEMFSetup() {
  	
    EPackage$Registry::INSTANCE.put("'http://www.eclipse.org/dsl/domijProject'", DomijProjectPackage::eINSTANCE)
    //EPackage$Registry::INSTANCE.put("'http://www.omg.org/spec/20130218/ext'", IFML.Extensions.ExtensionsPackage::eINSTANCE)
    //EPackage$Registry::INSTANCE.put("'http://www.omg.org/spec/20130218/data'", IFML.DataTypes.DataTypesPackage::eINSTANCE)
    Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put("domijproject", new XMIResourceFactoryImpl);
  }
}
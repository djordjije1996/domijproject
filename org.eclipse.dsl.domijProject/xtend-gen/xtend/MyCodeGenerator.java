package xtend;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import domijProject.DomijProjectPackage;
import domijProject.GlobalErrorHandler;
import domijProject.Manufacture;
import domijProject.Model;
import domijProject.ProcessElement;
import domijProject.ProcessStep;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class MyCodeGenerator {
  private FileWriter fw;
  
  private File file;
  
  private CharSequence cs;
  
  private char[] htmlCode;
  
  public static void main(final String[] args) {
    MyCodeGenerator _myCodeGenerator = new MyCodeGenerator();
    _myCodeGenerator.generate("../../runtime-ErrorHandler3/test/My.domijproject");
  }
  
  public void generate(final String file) {
    this.doEMFSetup();
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    URI _createURI = URI.createURI(file);
    final Resource resource = resourceSet.getResource(_createURI, true);
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Model> _filter = Iterables.<Model>filter(_iterable, Model.class);
    Model model = ((Model[])Conversions.unwrapArray(_filter, Model.class))[0];
    try {
      CharSequence _createHTMLtable = this.createHTMLtable(model);
      InputOutput.<CharSequence>println(_createHTMLtable);
      File _file = new File("Model.html");
      final PrintStream fout = new PrintStream(_file);
      CharSequence _createHTMLtable_1 = this.createHTMLtable(model);
      fout.println(_createHTMLtable_1);
      fout.close();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public CharSequence createHTMLtable(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<style>");
    _builder.newLine();
    _builder.append("table {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("width: 100%;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border-collapse:collapse;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border:none;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("font-family:\"Times New Roman\",\"sans-serif\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("text-align:center;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("th, td {");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("border: 1pt solid windowtext;");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("padding: 5px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("td.sign {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("width: 10%;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("font-size: 150%;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".header {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("background-color: #f2f2f2;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("</style>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<table>");
    _builder.newLine();
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<td> Process step </td>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<td> Error </td>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<td> Effect </td>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<td> Cause </td>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<td> Severity [1-10] </td>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<td> Handler </td>");
    _builder.newLine();
    _builder.append("</tr>");
    _builder.newLine();
    {
      EList<Manufacture> _processing = model.getProcessing();
      for(final Manufacture man : _processing) {
        {
          EList<ProcessElement> _elements = man.getElements();
          for(final ProcessElement element : _elements) {
            _builder.append("\t");
            _builder.newLine();
            {
              if ((element instanceof ProcessStep)) {
                {
                  EList<domijProject.Error> _errors = ((ProcessStep)element).getErrors();
                  for(final domijProject.Error e : _errors) {
                    _builder.append("\t");
                    _builder.append("<tr>");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<td> ");
                    String _name = ((ProcessStep)element).getName();
                    _builder.append(_name, "\t\t");
                    _builder.append(" </td>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<td> ");
                    String _name_1 = e.getName();
                    _builder.append(_name_1, "\t\t");
                    _builder.append(" </td>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<td> ");
                    String _effect = e.getEffect();
                    _builder.append(_effect, "\t\t");
                    _builder.append(" </td>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<td> ");
                    String _cause = e.getCause();
                    _builder.append(_cause, "\t\t");
                    _builder.append(" </td>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<td> ");
                    int _severityOfError = e.getSeverityOfError();
                    _builder.append(_severityOfError, "\t\t");
                    _builder.append(" </td>");
                    _builder.newLineIfNotEmpty();
                    {
                      GlobalErrorHandler _globalerrorhandler = e.getGlobalerrorhandler();
                      boolean _notEquals = (!Objects.equal(_globalerrorhandler, null));
                      if (_notEquals) {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("<td> GLOBAL: ");
                        GlobalErrorHandler _globalerrorhandler_1 = e.getGlobalerrorhandler();
                        String _name_2 = _globalerrorhandler_1.getName();
                        _builder.append(_name_2, "\t\t");
                        _builder.append(" </td>");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("\t");
                      } else {
                        _builder.append("<td> LOCAL: Starts with step: ");
                        ProcessStep _errorLink = e.getErrorLink();
                        String _name_3 = _errorLink.getName();
                        _builder.append(_name_3, "\t\t");
                        _builder.append(" </td>");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("\t");
                    _builder.append("</tr>");
                    _builder.newLine();
                  }
                }
              }
            }
            _builder.append("\t");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("</table>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html> \t");
    _builder.newLine();
    return _builder;
  }
  
  public Object doEMFSetup() {
    Object _xblockexpression = null;
    {
      EPackage.Registry.INSTANCE.put("\'http://www.eclipse.org/dsl/domijProject\'", DomijProjectPackage.eINSTANCE);
      Map<String,Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _xblockexpression = _extensionToFactoryMap.put("domijproject", _xMIResourceFactoryImpl);
    }
    return _xblockexpression;
  }
}

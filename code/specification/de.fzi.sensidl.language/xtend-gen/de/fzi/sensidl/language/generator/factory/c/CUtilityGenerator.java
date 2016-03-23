package de.fzi.sensidl.language.generator.factory.c;

import com.google.common.collect.Iterables;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.language.generator.GenerationUtil;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
import de.fzi.sensidl.language.generator.factory.IUtilityGenerator;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * C code generator for the utility header-file.
 */
@SuppressWarnings("all")
public class CUtilityGenerator implements IUtilityGenerator {
  private static Logger logger = Logger.getLogger(CUtilityGenerator.class);
  
  private List<MeasurementData> data;
  
  private SensorInterface currentSensorInterface;
  
  /**
   * The constructor calls the constructor of the superclass to set a list of Data-elements.
   * @param newData Represents the list of DataSet-elements.
   */
  public CUtilityGenerator(final List<EObject> newData) {
    Iterable<MeasurementData> _filter = Iterables.<MeasurementData>filter(newData, MeasurementData.class);
    List<MeasurementData> _list = IterableExtensions.<MeasurementData>toList(_filter);
    this.data = _list;
    Iterable<SensorInterface> _filter_1 = Iterables.<SensorInterface>filter(newData, SensorInterface.class);
    SensorInterface _get = ((SensorInterface[])Conversions.unwrapArray(_filter_1, SensorInterface.class))[0];
    this.currentSensorInterface = _get;
  }
  
  /**
   * @see IUtilityGenerator#generate()
   */
  @Override
  public HashMap<String, CharSequence> generate() {
    HashMap<String, CharSequence> _xblockexpression = null;
    {
      CUtilityGenerator.logger.info("Start with code-generation of the java utility class.");
      final HashMap<String, CharSequence> filesToGenerate = new HashMap<String, CharSequence>();
      final String utilityName = GenerationUtil.getUtilityName(this.currentSensorInterface);
      String _addFileExtensionTo = this.addFileExtensionTo(utilityName);
      CharSequence _generateUtility = this.generateUtility(utilityName);
      filesToGenerate.put(_addFileExtensionTo, _generateUtility);
      String _addFileExtensionTo_1 = this.addFileExtensionTo(utilityName);
      String _plus = ("File: " + _addFileExtensionTo_1);
      String _plus_1 = (_plus + " was generated in ");
      String _plus_2 = (_plus_1 + 
        SensIDLOutputConfigurationProvider.SENSIDL_GEN);
      CUtilityGenerator.logger.info(_plus_2);
      _xblockexpression = filesToGenerate;
    }
    return _xblockexpression;
  }
  
  public CharSequence generateUtility(final String string) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include <stdbool.h>");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * @see IUtilityGenerator#addFileExtensionTo(String)
   */
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + SensIDLConstants.HEADER_EXTENSION);
  }
}
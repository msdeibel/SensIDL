package de.fzi.sensidl.language.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.fzi.sensidl.language.services.SensidlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSensidlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_ANY_OTHER", "RULE_DESCRIPTION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'SENSIDL_BINARY'", "'SENSIDL_JSON'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'STRING'", "'BOOLEAN'", "'INT8'", "'UINT8'", "'INT16'", "'UINT16'", "'INT32'", "'UINT32'", "'INT64'", "'UINT64'", "'FLOAT'", "'DOUBLE'", "'sensorInterface'", "'{'", "'}'", "'with identifier'", "':'", "'encoding'", "','", "'endianness'", "'alignment'", "'BIT'", "'sensorData'", "'dataSet'", "'uses'", "'as'", "'in'", "'adjusted'", "'value'", "'='", "'with range'", "'['", "';'", "']'", "'with scaling factor'", "'and offset'", "'by linear mapping'", "'=>'", "'.'", "'constant'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int RULE_DESCRIPTION=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSensidlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSensidlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSensidlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSensidl.g"; }


     
     	private SensidlGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SensidlGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSensorInterface"
    // InternalSensidl.g:60:1: entryRuleSensorInterface : ruleSensorInterface EOF ;
    public final void entryRuleSensorInterface() throws RecognitionException {
        try {
            // InternalSensidl.g:61:1: ( ruleSensorInterface EOF )
            // InternalSensidl.g:62:1: ruleSensorInterface EOF
            {
             before(grammarAccess.getSensorInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorInterface();

            state._fsp--;

             after(grammarAccess.getSensorInterfaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensorInterface"


    // $ANTLR start "ruleSensorInterface"
    // InternalSensidl.g:69:1: ruleSensorInterface : ( ( rule__SensorInterface__Group__0 ) ) ;
    public final void ruleSensorInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:73:2: ( ( ( rule__SensorInterface__Group__0 ) ) )
            // InternalSensidl.g:74:1: ( ( rule__SensorInterface__Group__0 ) )
            {
            // InternalSensidl.g:74:1: ( ( rule__SensorInterface__Group__0 ) )
            // InternalSensidl.g:75:1: ( rule__SensorInterface__Group__0 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getGroup()); 
            // InternalSensidl.g:76:1: ( rule__SensorInterface__Group__0 )
            // InternalSensidl.g:76:2: rule__SensorInterface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorInterface"


    // $ANTLR start "entryRuleEncodingSettings"
    // InternalSensidl.g:88:1: entryRuleEncodingSettings : ruleEncodingSettings EOF ;
    public final void entryRuleEncodingSettings() throws RecognitionException {
        try {
            // InternalSensidl.g:89:1: ( ruleEncodingSettings EOF )
            // InternalSensidl.g:90:1: ruleEncodingSettings EOF
            {
             before(grammarAccess.getEncodingSettingsRule()); 
            pushFollow(FOLLOW_1);
            ruleEncodingSettings();

            state._fsp--;

             after(grammarAccess.getEncodingSettingsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEncodingSettings"


    // $ANTLR start "ruleEncodingSettings"
    // InternalSensidl.g:97:1: ruleEncodingSettings : ( ( rule__EncodingSettings__Group__0 ) ) ;
    public final void ruleEncodingSettings() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:101:2: ( ( ( rule__EncodingSettings__Group__0 ) ) )
            // InternalSensidl.g:102:1: ( ( rule__EncodingSettings__Group__0 ) )
            {
            // InternalSensidl.g:102:1: ( ( rule__EncodingSettings__Group__0 ) )
            // InternalSensidl.g:103:1: ( rule__EncodingSettings__Group__0 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getGroup()); 
            // InternalSensidl.g:104:1: ( rule__EncodingSettings__Group__0 )
            // InternalSensidl.g:104:2: rule__EncodingSettings__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEncodingSettingsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEncodingSettings"


    // $ANTLR start "entryRuleSensorDataDescription"
    // InternalSensidl.g:116:1: entryRuleSensorDataDescription : ruleSensorDataDescription EOF ;
    public final void entryRuleSensorDataDescription() throws RecognitionException {
        try {
            // InternalSensidl.g:117:1: ( ruleSensorDataDescription EOF )
            // InternalSensidl.g:118:1: ruleSensorDataDescription EOF
            {
             before(grammarAccess.getSensorDataDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorDataDescription();

            state._fsp--;

             after(grammarAccess.getSensorDataDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensorDataDescription"


    // $ANTLR start "ruleSensorDataDescription"
    // InternalSensidl.g:125:1: ruleSensorDataDescription : ( ( rule__SensorDataDescription__Group__0 ) ) ;
    public final void ruleSensorDataDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:129:2: ( ( ( rule__SensorDataDescription__Group__0 ) ) )
            // InternalSensidl.g:130:1: ( ( rule__SensorDataDescription__Group__0 ) )
            {
            // InternalSensidl.g:130:1: ( ( rule__SensorDataDescription__Group__0 ) )
            // InternalSensidl.g:131:1: ( rule__SensorDataDescription__Group__0 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getGroup()); 
            // InternalSensidl.g:132:1: ( rule__SensorDataDescription__Group__0 )
            // InternalSensidl.g:132:2: rule__SensorDataDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorDataDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorDataDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorDataDescription"


    // $ANTLR start "entryRuleDataSet"
    // InternalSensidl.g:144:1: entryRuleDataSet : ruleDataSet EOF ;
    public final void entryRuleDataSet() throws RecognitionException {
        try {
            // InternalSensidl.g:145:1: ( ruleDataSet EOF )
            // InternalSensidl.g:146:1: ruleDataSet EOF
            {
             before(grammarAccess.getDataSetRule()); 
            pushFollow(FOLLOW_1);
            ruleDataSet();

            state._fsp--;

             after(grammarAccess.getDataSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataSet"


    // $ANTLR start "ruleDataSet"
    // InternalSensidl.g:153:1: ruleDataSet : ( ( rule__DataSet__Group__0 ) ) ;
    public final void ruleDataSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:157:2: ( ( ( rule__DataSet__Group__0 ) ) )
            // InternalSensidl.g:158:1: ( ( rule__DataSet__Group__0 ) )
            {
            // InternalSensidl.g:158:1: ( ( rule__DataSet__Group__0 ) )
            // InternalSensidl.g:159:1: ( rule__DataSet__Group__0 )
            {
             before(grammarAccess.getDataSetAccess().getGroup()); 
            // InternalSensidl.g:160:1: ( rule__DataSet__Group__0 )
            // InternalSensidl.g:160:2: rule__DataSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataSet"


    // $ANTLR start "entryRuleData"
    // InternalSensidl.g:172:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalSensidl.g:173:1: ( ruleData EOF )
            // InternalSensidl.g:174:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalSensidl.g:181:1: ruleData : ( ( rule__Data__Alternatives ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:185:2: ( ( ( rule__Data__Alternatives ) ) )
            // InternalSensidl.g:186:1: ( ( rule__Data__Alternatives ) )
            {
            // InternalSensidl.g:186:1: ( ( rule__Data__Alternatives ) )
            // InternalSensidl.g:187:1: ( rule__Data__Alternatives )
            {
             before(grammarAccess.getDataAccess().getAlternatives()); 
            // InternalSensidl.g:188:1: ( rule__Data__Alternatives )
            // InternalSensidl.g:188:2: rule__Data__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Data__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleMeasurementData"
    // InternalSensidl.g:200:1: entryRuleMeasurementData : ruleMeasurementData EOF ;
    public final void entryRuleMeasurementData() throws RecognitionException {
        try {
            // InternalSensidl.g:201:1: ( ruleMeasurementData EOF )
            // InternalSensidl.g:202:1: ruleMeasurementData EOF
            {
             before(grammarAccess.getMeasurementDataRule()); 
            pushFollow(FOLLOW_1);
            ruleMeasurementData();

            state._fsp--;

             after(grammarAccess.getMeasurementDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeasurementData"


    // $ANTLR start "ruleMeasurementData"
    // InternalSensidl.g:209:1: ruleMeasurementData : ( ( rule__MeasurementData__Group__0 ) ) ;
    public final void ruleMeasurementData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:213:2: ( ( ( rule__MeasurementData__Group__0 ) ) )
            // InternalSensidl.g:214:1: ( ( rule__MeasurementData__Group__0 ) )
            {
            // InternalSensidl.g:214:1: ( ( rule__MeasurementData__Group__0 ) )
            // InternalSensidl.g:215:1: ( rule__MeasurementData__Group__0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup()); 
            // InternalSensidl.g:216:1: ( rule__MeasurementData__Group__0 )
            // InternalSensidl.g:216:2: rule__MeasurementData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasurementData"


    // $ANTLR start "entryRuleNonMeasurementData"
    // InternalSensidl.g:228:1: entryRuleNonMeasurementData : ruleNonMeasurementData EOF ;
    public final void entryRuleNonMeasurementData() throws RecognitionException {
        try {
            // InternalSensidl.g:229:1: ( ruleNonMeasurementData EOF )
            // InternalSensidl.g:230:1: ruleNonMeasurementData EOF
            {
             before(grammarAccess.getNonMeasurementDataRule()); 
            pushFollow(FOLLOW_1);
            ruleNonMeasurementData();

            state._fsp--;

             after(grammarAccess.getNonMeasurementDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNonMeasurementData"


    // $ANTLR start "ruleNonMeasurementData"
    // InternalSensidl.g:237:1: ruleNonMeasurementData : ( ( rule__NonMeasurementData__Group__0 ) ) ;
    public final void ruleNonMeasurementData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:241:2: ( ( ( rule__NonMeasurementData__Group__0 ) ) )
            // InternalSensidl.g:242:1: ( ( rule__NonMeasurementData__Group__0 ) )
            {
            // InternalSensidl.g:242:1: ( ( rule__NonMeasurementData__Group__0 ) )
            // InternalSensidl.g:243:1: ( rule__NonMeasurementData__Group__0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup()); 
            // InternalSensidl.g:244:1: ( rule__NonMeasurementData__Group__0 )
            // InternalSensidl.g:244:2: rule__NonMeasurementData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonMeasurementData"


    // $ANTLR start "entryRuleMeasurementDataNotAdjustable"
    // InternalSensidl.g:256:1: entryRuleMeasurementDataNotAdjustable : ruleMeasurementDataNotAdjustable EOF ;
    public final void entryRuleMeasurementDataNotAdjustable() throws RecognitionException {
        try {
            // InternalSensidl.g:257:1: ( ruleMeasurementDataNotAdjustable EOF )
            // InternalSensidl.g:258:1: ruleMeasurementDataNotAdjustable EOF
            {
             before(grammarAccess.getMeasurementDataNotAdjustableRule()); 
            pushFollow(FOLLOW_1);
            ruleMeasurementDataNotAdjustable();

            state._fsp--;

             after(grammarAccess.getMeasurementDataNotAdjustableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeasurementDataNotAdjustable"


    // $ANTLR start "ruleMeasurementDataNotAdjustable"
    // InternalSensidl.g:265:1: ruleMeasurementDataNotAdjustable : ( ( rule__MeasurementDataNotAdjustable__Group__0 ) ) ;
    public final void ruleMeasurementDataNotAdjustable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:269:2: ( ( ( rule__MeasurementDataNotAdjustable__Group__0 ) ) )
            // InternalSensidl.g:270:1: ( ( rule__MeasurementDataNotAdjustable__Group__0 ) )
            {
            // InternalSensidl.g:270:1: ( ( rule__MeasurementDataNotAdjustable__Group__0 ) )
            // InternalSensidl.g:271:1: ( rule__MeasurementDataNotAdjustable__Group__0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup()); 
            // InternalSensidl.g:272:1: ( rule__MeasurementDataNotAdjustable__Group__0 )
            // InternalSensidl.g:272:2: rule__MeasurementDataNotAdjustable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasurementDataNotAdjustable"


    // $ANTLR start "entryRuleDataRange"
    // InternalSensidl.g:284:1: entryRuleDataRange : ruleDataRange EOF ;
    public final void entryRuleDataRange() throws RecognitionException {
        try {
            // InternalSensidl.g:285:1: ( ruleDataRange EOF )
            // InternalSensidl.g:286:1: ruleDataRange EOF
            {
             before(grammarAccess.getDataRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataRange();

            state._fsp--;

             after(grammarAccess.getDataRangeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataRange"


    // $ANTLR start "ruleDataRange"
    // InternalSensidl.g:293:1: ruleDataRange : ( ( rule__DataRange__Group__0 ) ) ;
    public final void ruleDataRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:297:2: ( ( ( rule__DataRange__Group__0 ) ) )
            // InternalSensidl.g:298:1: ( ( rule__DataRange__Group__0 ) )
            {
            // InternalSensidl.g:298:1: ( ( rule__DataRange__Group__0 ) )
            // InternalSensidl.g:299:1: ( rule__DataRange__Group__0 )
            {
             before(grammarAccess.getDataRangeAccess().getGroup()); 
            // InternalSensidl.g:300:1: ( rule__DataRange__Group__0 )
            // InternalSensidl.g:300:2: rule__DataRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataRange"


    // $ANTLR start "entryRuleInterval"
    // InternalSensidl.g:312:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // InternalSensidl.g:313:1: ( ruleInterval EOF )
            // InternalSensidl.g:314:1: ruleInterval EOF
            {
             before(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_1);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getIntervalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // InternalSensidl.g:321:1: ruleInterval : ( ( rule__Interval__Group__0 ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:325:2: ( ( ( rule__Interval__Group__0 ) ) )
            // InternalSensidl.g:326:1: ( ( rule__Interval__Group__0 ) )
            {
            // InternalSensidl.g:326:1: ( ( rule__Interval__Group__0 ) )
            // InternalSensidl.g:327:1: ( rule__Interval__Group__0 )
            {
             before(grammarAccess.getIntervalAccess().getGroup()); 
            // InternalSensidl.g:328:1: ( rule__Interval__Group__0 )
            // InternalSensidl.g:328:2: rule__Interval__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleDataConversion"
    // InternalSensidl.g:340:1: entryRuleDataConversion : ruleDataConversion EOF ;
    public final void entryRuleDataConversion() throws RecognitionException {
        try {
            // InternalSensidl.g:341:1: ( ruleDataConversion EOF )
            // InternalSensidl.g:342:1: ruleDataConversion EOF
            {
             before(grammarAccess.getDataConversionRule()); 
            pushFollow(FOLLOW_1);
            ruleDataConversion();

            state._fsp--;

             after(grammarAccess.getDataConversionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataConversion"


    // $ANTLR start "ruleDataConversion"
    // InternalSensidl.g:349:1: ruleDataConversion : ( ( rule__DataConversion__Alternatives ) ) ;
    public final void ruleDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:353:2: ( ( ( rule__DataConversion__Alternatives ) ) )
            // InternalSensidl.g:354:1: ( ( rule__DataConversion__Alternatives ) )
            {
            // InternalSensidl.g:354:1: ( ( rule__DataConversion__Alternatives ) )
            // InternalSensidl.g:355:1: ( rule__DataConversion__Alternatives )
            {
             before(grammarAccess.getDataConversionAccess().getAlternatives()); 
            // InternalSensidl.g:356:1: ( rule__DataConversion__Alternatives )
            // InternalSensidl.g:356:2: rule__DataConversion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataConversion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataConversionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataConversion"


    // $ANTLR start "entryRuleLinearDataConversion"
    // InternalSensidl.g:368:1: entryRuleLinearDataConversion : ruleLinearDataConversion EOF ;
    public final void entryRuleLinearDataConversion() throws RecognitionException {
        try {
            // InternalSensidl.g:369:1: ( ruleLinearDataConversion EOF )
            // InternalSensidl.g:370:1: ruleLinearDataConversion EOF
            {
             before(grammarAccess.getLinearDataConversionRule()); 
            pushFollow(FOLLOW_1);
            ruleLinearDataConversion();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinearDataConversion"


    // $ANTLR start "ruleLinearDataConversion"
    // InternalSensidl.g:377:1: ruleLinearDataConversion : ( ( rule__LinearDataConversion__Group__0 ) ) ;
    public final void ruleLinearDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:381:2: ( ( ( rule__LinearDataConversion__Group__0 ) ) )
            // InternalSensidl.g:382:1: ( ( rule__LinearDataConversion__Group__0 ) )
            {
            // InternalSensidl.g:382:1: ( ( rule__LinearDataConversion__Group__0 ) )
            // InternalSensidl.g:383:1: ( rule__LinearDataConversion__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getGroup()); 
            // InternalSensidl.g:384:1: ( rule__LinearDataConversion__Group__0 )
            // InternalSensidl.g:384:2: rule__LinearDataConversion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinearDataConversion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinearDataConversion"


    // $ANTLR start "entryRuleLinearDataConversionWithInterval"
    // InternalSensidl.g:396:1: entryRuleLinearDataConversionWithInterval : ruleLinearDataConversionWithInterval EOF ;
    public final void entryRuleLinearDataConversionWithInterval() throws RecognitionException {
        try {
            // InternalSensidl.g:397:1: ( ruleLinearDataConversionWithInterval EOF )
            // InternalSensidl.g:398:1: ruleLinearDataConversionWithInterval EOF
            {
             before(grammarAccess.getLinearDataConversionWithIntervalRule()); 
            pushFollow(FOLLOW_1);
            ruleLinearDataConversionWithInterval();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionWithIntervalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinearDataConversionWithInterval"


    // $ANTLR start "ruleLinearDataConversionWithInterval"
    // InternalSensidl.g:405:1: ruleLinearDataConversionWithInterval : ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) ;
    public final void ruleLinearDataConversionWithInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:409:2: ( ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) )
            // InternalSensidl.g:410:1: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            {
            // InternalSensidl.g:410:1: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            // InternalSensidl.g:411:1: ( rule__LinearDataConversionWithInterval__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getGroup()); 
            // InternalSensidl.g:412:1: ( rule__LinearDataConversionWithInterval__Group__0 )
            // InternalSensidl.g:412:2: rule__LinearDataConversionWithInterval__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinearDataConversionWithInterval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinearDataConversionWithInterval"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalSensidl.g:424:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalSensidl.g:425:1: ( ruleDOUBLE EOF )
            // InternalSensidl.g:426:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalSensidl.g:433:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:437:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalSensidl.g:438:1: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalSensidl.g:438:1: ( ( rule__DOUBLE__Group__0 ) )
            // InternalSensidl.g:439:1: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // InternalSensidl.g:440:1: ( rule__DOUBLE__Group__0 )
            // InternalSensidl.g:440:2: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleUNIT"
    // InternalSensidl.g:452:1: entryRuleUNIT : ruleUNIT EOF ;
    public final void entryRuleUNIT() throws RecognitionException {
        try {
            // InternalSensidl.g:453:1: ( ruleUNIT EOF )
            // InternalSensidl.g:454:1: ruleUNIT EOF
            {
             before(grammarAccess.getUNITRule()); 
            pushFollow(FOLLOW_1);
            ruleUNIT();

            state._fsp--;

             after(grammarAccess.getUNITRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUNIT"


    // $ANTLR start "ruleUNIT"
    // InternalSensidl.g:461:1: ruleUNIT : ( ( rule__UNIT__Group__0 ) ) ;
    public final void ruleUNIT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:465:2: ( ( ( rule__UNIT__Group__0 ) ) )
            // InternalSensidl.g:466:1: ( ( rule__UNIT__Group__0 ) )
            {
            // InternalSensidl.g:466:1: ( ( rule__UNIT__Group__0 ) )
            // InternalSensidl.g:467:1: ( rule__UNIT__Group__0 )
            {
             before(grammarAccess.getUNITAccess().getGroup()); 
            // InternalSensidl.g:468:1: ( rule__UNIT__Group__0 )
            // InternalSensidl.g:468:2: rule__UNIT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UNIT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUNITAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUNIT"


    // $ANTLR start "ruleCoding"
    // InternalSensidl.g:481:1: ruleCoding : ( ( rule__Coding__Alternatives ) ) ;
    public final void ruleCoding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:485:1: ( ( ( rule__Coding__Alternatives ) ) )
            // InternalSensidl.g:486:1: ( ( rule__Coding__Alternatives ) )
            {
            // InternalSensidl.g:486:1: ( ( rule__Coding__Alternatives ) )
            // InternalSensidl.g:487:1: ( rule__Coding__Alternatives )
            {
             before(grammarAccess.getCodingAccess().getAlternatives()); 
            // InternalSensidl.g:488:1: ( rule__Coding__Alternatives )
            // InternalSensidl.g:488:2: rule__Coding__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Coding__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCodingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoding"


    // $ANTLR start "ruleEndianness"
    // InternalSensidl.g:500:1: ruleEndianness : ( ( rule__Endianness__Alternatives ) ) ;
    public final void ruleEndianness() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:504:1: ( ( ( rule__Endianness__Alternatives ) ) )
            // InternalSensidl.g:505:1: ( ( rule__Endianness__Alternatives ) )
            {
            // InternalSensidl.g:505:1: ( ( rule__Endianness__Alternatives ) )
            // InternalSensidl.g:506:1: ( rule__Endianness__Alternatives )
            {
             before(grammarAccess.getEndiannessAccess().getAlternatives()); 
            // InternalSensidl.g:507:1: ( rule__Endianness__Alternatives )
            // InternalSensidl.g:507:2: rule__Endianness__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Endianness__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEndiannessAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndianness"


    // $ANTLR start "ruleDataTypeNotAdjustable"
    // InternalSensidl.g:519:1: ruleDataTypeNotAdjustable : ( ( rule__DataTypeNotAdjustable__Alternatives ) ) ;
    public final void ruleDataTypeNotAdjustable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:523:1: ( ( ( rule__DataTypeNotAdjustable__Alternatives ) ) )
            // InternalSensidl.g:524:1: ( ( rule__DataTypeNotAdjustable__Alternatives ) )
            {
            // InternalSensidl.g:524:1: ( ( rule__DataTypeNotAdjustable__Alternatives ) )
            // InternalSensidl.g:525:1: ( rule__DataTypeNotAdjustable__Alternatives )
            {
             before(grammarAccess.getDataTypeNotAdjustableAccess().getAlternatives()); 
            // InternalSensidl.g:526:1: ( rule__DataTypeNotAdjustable__Alternatives )
            // InternalSensidl.g:526:2: rule__DataTypeNotAdjustable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeNotAdjustable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeNotAdjustableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypeNotAdjustable"


    // $ANTLR start "ruleDataType"
    // InternalSensidl.g:538:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:542:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSensidl.g:543:1: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSensidl.g:543:1: ( ( rule__DataType__Alternatives ) )
            // InternalSensidl.g:544:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSensidl.g:545:1: ( rule__DataType__Alternatives )
            // InternalSensidl.g:545:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__Data__Alternatives"
    // InternalSensidl.g:556:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:560:1: ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalSensidl.g:561:1: ( ruleMeasurementData )
                    {
                    // InternalSensidl.g:561:1: ( ruleMeasurementData )
                    // InternalSensidl.g:562:1: ruleMeasurementData
                    {
                     before(grammarAccess.getDataAccess().getMeasurementDataParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMeasurementData();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getMeasurementDataParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:567:6: ( ruleNonMeasurementData )
                    {
                    // InternalSensidl.g:567:6: ( ruleNonMeasurementData )
                    // InternalSensidl.g:568:1: ruleNonMeasurementData
                    {
                     before(grammarAccess.getDataAccess().getNonMeasurementDataParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNonMeasurementData();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getNonMeasurementDataParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSensidl.g:573:6: ( ruleMeasurementDataNotAdjustable )
                    {
                    // InternalSensidl.g:573:6: ( ruleMeasurementDataNotAdjustable )
                    // InternalSensidl.g:574:1: ruleMeasurementDataNotAdjustable
                    {
                     before(grammarAccess.getDataAccess().getMeasurementDataNotAdjustableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMeasurementDataNotAdjustable();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getMeasurementDataNotAdjustableParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Alternatives"


    // $ANTLR start "rule__MeasurementData__Alternatives_6"
    // InternalSensidl.g:584:1: rule__MeasurementData__Alternatives_6 : ( ( ( rule__MeasurementData__Group_6_0__0 ) ) | ( ( rule__MeasurementData__Group_6_1__0 ) ) | ( ( rule__MeasurementData__Group_6_2__0 ) ) );
    public final void rule__MeasurementData__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:588:1: ( ( ( rule__MeasurementData__Group_6_0__0 ) ) | ( ( rule__MeasurementData__Group_6_1__0 ) ) | ( ( rule__MeasurementData__Group_6_2__0 ) ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSensidl.g:589:1: ( ( rule__MeasurementData__Group_6_0__0 ) )
                    {
                    // InternalSensidl.g:589:1: ( ( rule__MeasurementData__Group_6_0__0 ) )
                    // InternalSensidl.g:590:1: ( rule__MeasurementData__Group_6_0__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_6_0()); 
                    // InternalSensidl.g:591:1: ( rule__MeasurementData__Group_6_0__0 )
                    // InternalSensidl.g:591:2: rule__MeasurementData__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMeasurementDataAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:595:6: ( ( rule__MeasurementData__Group_6_1__0 ) )
                    {
                    // InternalSensidl.g:595:6: ( ( rule__MeasurementData__Group_6_1__0 ) )
                    // InternalSensidl.g:596:1: ( rule__MeasurementData__Group_6_1__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_6_1()); 
                    // InternalSensidl.g:597:1: ( rule__MeasurementData__Group_6_1__0 )
                    // InternalSensidl.g:597:2: rule__MeasurementData__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMeasurementDataAccess().getGroup_6_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSensidl.g:601:6: ( ( rule__MeasurementData__Group_6_2__0 ) )
                    {
                    // InternalSensidl.g:601:6: ( ( rule__MeasurementData__Group_6_2__0 ) )
                    // InternalSensidl.g:602:1: ( rule__MeasurementData__Group_6_2__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_6_2()); 
                    // InternalSensidl.g:603:1: ( rule__MeasurementData__Group_6_2__0 )
                    // InternalSensidl.g:603:2: rule__MeasurementData__Group_6_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__Group_6_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMeasurementDataAccess().getGroup_6_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Alternatives_6"


    // $ANTLR start "rule__NonMeasurementData__Alternatives_2"
    // InternalSensidl.g:612:1: rule__NonMeasurementData__Alternatives_2 : ( ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) ) | ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) ) );
    public final void rule__NonMeasurementData__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:616:1: ( ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) ) | ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=18 && LA3_0<=27)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=16 && LA3_0<=17)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSensidl.g:617:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) )
                    {
                    // InternalSensidl.g:617:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) )
                    // InternalSensidl.g:618:1: ( rule__NonMeasurementData__DataTypeAssignment_2_0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_0()); 
                    // InternalSensidl.g:619:1: ( rule__NonMeasurementData__DataTypeAssignment_2_0 )
                    // InternalSensidl.g:619:2: rule__NonMeasurementData__DataTypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__DataTypeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:623:6: ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) )
                    {
                    // InternalSensidl.g:623:6: ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) )
                    // InternalSensidl.g:624:1: ( rule__NonMeasurementData__DataTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_1()); 
                    // InternalSensidl.g:625:1: ( rule__NonMeasurementData__DataTypeAssignment_2_1 )
                    // InternalSensidl.g:625:2: rule__NonMeasurementData__DataTypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__DataTypeAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Alternatives_2"


    // $ANTLR start "rule__DataConversion__Alternatives"
    // InternalSensidl.g:634:1: rule__DataConversion__Alternatives : ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) );
    public final void rule__DataConversion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:638:1: ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==50) ) {
                alt4=1;
            }
            else if ( (LA4_0==52) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSensidl.g:639:1: ( ruleLinearDataConversion )
                    {
                    // InternalSensidl.g:639:1: ( ruleLinearDataConversion )
                    // InternalSensidl.g:640:1: ruleLinearDataConversion
                    {
                     before(grammarAccess.getDataConversionAccess().getLinearDataConversionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLinearDataConversion();

                    state._fsp--;

                     after(grammarAccess.getDataConversionAccess().getLinearDataConversionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:645:6: ( ruleLinearDataConversionWithInterval )
                    {
                    // InternalSensidl.g:645:6: ( ruleLinearDataConversionWithInterval )
                    // InternalSensidl.g:646:1: ruleLinearDataConversionWithInterval
                    {
                     before(grammarAccess.getDataConversionAccess().getLinearDataConversionWithIntervalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLinearDataConversionWithInterval();

                    state._fsp--;

                     after(grammarAccess.getDataConversionAccess().getLinearDataConversionWithIntervalParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataConversion__Alternatives"


    // $ANTLR start "rule__Coding__Alternatives"
    // InternalSensidl.g:656:1: rule__Coding__Alternatives : ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) );
    public final void rule__Coding__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:660:1: ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSensidl.g:661:1: ( ( 'SENSIDL_BINARY' ) )
                    {
                    // InternalSensidl.g:661:1: ( ( 'SENSIDL_BINARY' ) )
                    // InternalSensidl.g:662:1: ( 'SENSIDL_BINARY' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:663:1: ( 'SENSIDL_BINARY' )
                    // InternalSensidl.g:663:3: 'SENSIDL_BINARY'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:668:6: ( ( 'SENSIDL_JSON' ) )
                    {
                    // InternalSensidl.g:668:6: ( ( 'SENSIDL_JSON' ) )
                    // InternalSensidl.g:669:1: ( 'SENSIDL_JSON' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_JSONEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:670:1: ( 'SENSIDL_JSON' )
                    // InternalSensidl.g:670:3: 'SENSIDL_JSON'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCodingAccess().getSENSIDL_JSONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coding__Alternatives"


    // $ANTLR start "rule__Endianness__Alternatives"
    // InternalSensidl.g:680:1: rule__Endianness__Alternatives : ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) );
    public final void rule__Endianness__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:684:1: ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSensidl.g:685:1: ( ( 'BIG_ENDIAN' ) )
                    {
                    // InternalSensidl.g:685:1: ( ( 'BIG_ENDIAN' ) )
                    // InternalSensidl.g:686:1: ( 'BIG_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:687:1: ( 'BIG_ENDIAN' )
                    // InternalSensidl.g:687:3: 'BIG_ENDIAN'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:692:6: ( ( 'LITTLE_ENDIAN' ) )
                    {
                    // InternalSensidl.g:692:6: ( ( 'LITTLE_ENDIAN' ) )
                    // InternalSensidl.g:693:1: ( 'LITTLE_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:694:1: ( 'LITTLE_ENDIAN' )
                    // InternalSensidl.g:694:3: 'LITTLE_ENDIAN'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndiannessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endianness__Alternatives"


    // $ANTLR start "rule__DataTypeNotAdjustable__Alternatives"
    // InternalSensidl.g:704:1: rule__DataTypeNotAdjustable__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) );
    public final void rule__DataTypeNotAdjustable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:708:1: ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSensidl.g:709:1: ( ( 'STRING' ) )
                    {
                    // InternalSensidl.g:709:1: ( ( 'STRING' ) )
                    // InternalSensidl.g:710:1: ( 'STRING' )
                    {
                     before(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:711:1: ( 'STRING' )
                    // InternalSensidl.g:711:3: 'STRING'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:716:6: ( ( 'BOOLEAN' ) )
                    {
                    // InternalSensidl.g:716:6: ( ( 'BOOLEAN' ) )
                    // InternalSensidl.g:717:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getDataTypeNotAdjustableAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:718:1: ( 'BOOLEAN' )
                    // InternalSensidl.g:718:3: 'BOOLEAN'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeNotAdjustableAccess().getBOOLEANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeNotAdjustable__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalSensidl.g:728:1: rule__DataType__Alternatives : ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:732:1: ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) )
            int alt8=10;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            case 22:
                {
                alt8=5;
                }
                break;
            case 23:
                {
                alt8=6;
                }
                break;
            case 24:
                {
                alt8=7;
                }
                break;
            case 25:
                {
                alt8=8;
                }
                break;
            case 26:
                {
                alt8=9;
                }
                break;
            case 27:
                {
                alt8=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSensidl.g:733:1: ( ( 'INT8' ) )
                    {
                    // InternalSensidl.g:733:1: ( ( 'INT8' ) )
                    // InternalSensidl.g:734:1: ( 'INT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:735:1: ( 'INT8' )
                    // InternalSensidl.g:735:3: 'INT8'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:740:6: ( ( 'UINT8' ) )
                    {
                    // InternalSensidl.g:740:6: ( ( 'UINT8' ) )
                    // InternalSensidl.g:741:1: ( 'UINT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:742:1: ( 'UINT8' )
                    // InternalSensidl.g:742:3: 'UINT8'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSensidl.g:747:6: ( ( 'INT16' ) )
                    {
                    // InternalSensidl.g:747:6: ( ( 'INT16' ) )
                    // InternalSensidl.g:748:1: ( 'INT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 
                    // InternalSensidl.g:749:1: ( 'INT16' )
                    // InternalSensidl.g:749:3: 'INT16'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSensidl.g:754:6: ( ( 'UINT16' ) )
                    {
                    // InternalSensidl.g:754:6: ( ( 'UINT16' ) )
                    // InternalSensidl.g:755:1: ( 'UINT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 
                    // InternalSensidl.g:756:1: ( 'UINT16' )
                    // InternalSensidl.g:756:3: 'UINT16'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSensidl.g:761:6: ( ( 'INT32' ) )
                    {
                    // InternalSensidl.g:761:6: ( ( 'INT32' ) )
                    // InternalSensidl.g:762:1: ( 'INT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 
                    // InternalSensidl.g:763:1: ( 'INT32' )
                    // InternalSensidl.g:763:3: 'INT32'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSensidl.g:768:6: ( ( 'UINT32' ) )
                    {
                    // InternalSensidl.g:768:6: ( ( 'UINT32' ) )
                    // InternalSensidl.g:769:1: ( 'UINT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 
                    // InternalSensidl.g:770:1: ( 'UINT32' )
                    // InternalSensidl.g:770:3: 'UINT32'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSensidl.g:775:6: ( ( 'INT64' ) )
                    {
                    // InternalSensidl.g:775:6: ( ( 'INT64' ) )
                    // InternalSensidl.g:776:1: ( 'INT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 
                    // InternalSensidl.g:777:1: ( 'INT64' )
                    // InternalSensidl.g:777:3: 'INT64'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSensidl.g:782:6: ( ( 'UINT64' ) )
                    {
                    // InternalSensidl.g:782:6: ( ( 'UINT64' ) )
                    // InternalSensidl.g:783:1: ( 'UINT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 
                    // InternalSensidl.g:784:1: ( 'UINT64' )
                    // InternalSensidl.g:784:3: 'UINT64'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSensidl.g:789:6: ( ( 'FLOAT' ) )
                    {
                    // InternalSensidl.g:789:6: ( ( 'FLOAT' ) )
                    // InternalSensidl.g:790:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                    // InternalSensidl.g:791:1: ( 'FLOAT' )
                    // InternalSensidl.g:791:3: 'FLOAT'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSensidl.g:796:6: ( ( 'DOUBLE' ) )
                    {
                    // InternalSensidl.g:796:6: ( ( 'DOUBLE' ) )
                    // InternalSensidl.g:797:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 
                    // InternalSensidl.g:798:1: ( 'DOUBLE' )
                    // InternalSensidl.g:798:3: 'DOUBLE'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__SensorInterface__Group__0"
    // InternalSensidl.g:810:1: rule__SensorInterface__Group__0 : rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 ;
    public final void rule__SensorInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:814:1: ( rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 )
            // InternalSensidl.g:815:2: rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SensorInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorInterface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__0"


    // $ANTLR start "rule__SensorInterface__Group__0__Impl"
    // InternalSensidl.g:822:1: rule__SensorInterface__Group__0__Impl : ( 'sensorInterface' ) ;
    public final void rule__SensorInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:826:1: ( ( 'sensorInterface' ) )
            // InternalSensidl.g:827:1: ( 'sensorInterface' )
            {
            // InternalSensidl.g:827:1: ( 'sensorInterface' )
            // InternalSensidl.g:828:1: 'sensorInterface'
            {
             before(grammarAccess.getSensorInterfaceAccess().getSensorInterfaceKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSensorInterfaceAccess().getSensorInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__0__Impl"


    // $ANTLR start "rule__SensorInterface__Group__1"
    // InternalSensidl.g:841:1: rule__SensorInterface__Group__1 : rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 ;
    public final void rule__SensorInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:845:1: ( rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 )
            // InternalSensidl.g:846:2: rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SensorInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorInterface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__1"


    // $ANTLR start "rule__SensorInterface__Group__1__Impl"
    // InternalSensidl.g:853:1: rule__SensorInterface__Group__1__Impl : ( ( rule__SensorInterface__NameAssignment_1 ) ) ;
    public final void rule__SensorInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:857:1: ( ( ( rule__SensorInterface__NameAssignment_1 ) ) )
            // InternalSensidl.g:858:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            {
            // InternalSensidl.g:858:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            // InternalSensidl.g:859:1: ( rule__SensorInterface__NameAssignment_1 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getNameAssignment_1()); 
            // InternalSensidl.g:860:1: ( rule__SensorInterface__NameAssignment_1 )
            // InternalSensidl.g:860:2: rule__SensorInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorInterface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__1__Impl"


    // $ANTLR start "rule__SensorInterface__Group__2"
    // InternalSensidl.g:870:1: rule__SensorInterface__Group__2 : rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 ;
    public final void rule__SensorInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:874:1: ( rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 )
            // InternalSensidl.g:875:2: rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SensorInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorInterface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__2"


    // $ANTLR start "rule__SensorInterface__Group__2__Impl"
    // InternalSensidl.g:882:1: rule__SensorInterface__Group__2__Impl : ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) ;
    public final void rule__SensorInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:886:1: ( ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) )
            // InternalSensidl.g:887:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            {
            // InternalSensidl.g:887:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            // InternalSensidl.g:888:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getDescriptionAssignment_2()); 
            // InternalSensidl.g:889:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DESCRIPTION) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSensidl.g:889:2: rule__SensorInterface__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SensorInterface__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorInterfaceAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__2__Impl"


    // $ANTLR start "rule__SensorInterface__Group__3"
    // InternalSensidl.g:899:1: rule__SensorInterface__Group__3 : rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 ;
    public final void rule__SensorInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:903:1: ( rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 )
            // InternalSensidl.g:904:2: rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__SensorInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorInterface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__3"


    // $ANTLR start "rule__SensorInterface__Group__3__Impl"
    // InternalSensidl.g:911:1: rule__SensorInterface__Group__3__Impl : ( ( rule__SensorInterface__Group_3__0 )? ) ;
    public final void rule__SensorInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:915:1: ( ( ( rule__SensorInterface__Group_3__0 )? ) )
            // InternalSensidl.g:916:1: ( ( rule__SensorInterface__Group_3__0 )? )
            {
            // InternalSensidl.g:916:1: ( ( rule__SensorInterface__Group_3__0 )? )
            // InternalSensidl.g:917:1: ( rule__SensorInterface__Group_3__0 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getGroup_3()); 
            // InternalSensidl.g:918:1: ( rule__SensorInterface__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSensidl.g:918:2: rule__SensorInterface__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SensorInterface__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorInterfaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__3__Impl"


    // $ANTLR start "rule__SensorInterface__Group__4"
    // InternalSensidl.g:928:1: rule__SensorInterface__Group__4 : rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 ;
    public final void rule__SensorInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:932:1: ( rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 )
            // InternalSensidl.g:933:2: rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__SensorInterface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorInterface__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__4"


    // $ANTLR start "rule__SensorInterface__Group__4__Impl"
    // InternalSensidl.g:940:1: rule__SensorInterface__Group__4__Impl : ( '{' ) ;
    public final void rule__SensorInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:944:1: ( ( '{' ) )
            // InternalSensidl.g:945:1: ( '{' )
            {
            // InternalSensidl.g:945:1: ( '{' )
            // InternalSensidl.g:946:1: '{'
            {
             before(grammarAccess.getSensorInterfaceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSensorInterfaceAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__4__Impl"


    // $ANTLR start "rule__SensorInterface__Group__5"
    // InternalSensidl.g:959:1: rule__SensorInterface__Group__5 : rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 ;
    public final void rule__SensorInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:963:1: ( rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 )
            // InternalSensidl.g:964:2: rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__SensorInterface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorInterface__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__5"


    // $ANTLR start "rule__SensorInterface__Group__5__Impl"
    // InternalSensidl.g:971:1: rule__SensorInterface__Group__5__Impl : ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) ;
    public final void rule__SensorInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:975:1: ( ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) )
            // InternalSensidl.g:976:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            {
            // InternalSensidl.g:976:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            // InternalSensidl.g:977:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsAssignment_5()); 
            // InternalSensidl.g:978:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            // InternalSensidl.g:978:2: rule__SensorInterface__EncodingSettingsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SensorInterface__EncodingSettingsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__5__Impl"


    // $ANTLR start "rule__SensorInterface__Group__6"
    // InternalSensidl.g:988:1: rule__SensorInterface__Group__6 : rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 ;
    public final void rule__SensorInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:992:1: ( rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 )
            // InternalSensidl.g:993:2: rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__SensorInterface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorInterface__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__6"


    // $ANTLR start "rule__SensorInterface__Group__6__Impl"
    // InternalSensidl.g:1000:1: rule__SensorInterface__Group__6__Impl : ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) ;
    public final void rule__SensorInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1004:1: ( ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) )
            // InternalSensidl.g:1005:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            {
            // InternalSensidl.g:1005:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            // InternalSensidl.g:1006:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getDataDescriptionAssignment_6()); 
            // InternalSensidl.g:1007:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            // InternalSensidl.g:1007:2: rule__SensorInterface__DataDescriptionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SensorInterface__DataDescriptionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSensorInterfaceAccess().getDataDescriptionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__6__Impl"


    // $ANTLR start "rule__SensorInterface__Group__7"
    // InternalSensidl.g:1017:1: rule__SensorInterface__Group__7 : rule__SensorInterface__Group__7__Impl ;
    public final void rule__SensorInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1021:1: ( rule__SensorInterface__Group__7__Impl )
            // InternalSensidl.g:1022:2: rule__SensorInterface__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorInterface__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__7"


    // $ANTLR start "rule__SensorInterface__Group__7__Impl"
    // InternalSensidl.g:1028:1: rule__SensorInterface__Group__7__Impl : ( '}' ) ;
    public final void rule__SensorInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1032:1: ( ( '}' ) )
            // InternalSensidl.g:1033:1: ( '}' )
            {
            // InternalSensidl.g:1033:1: ( '}' )
            // InternalSensidl.g:1034:1: '}'
            {
             before(grammarAccess.getSensorInterfaceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSensorInterfaceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__7__Impl"


    // $ANTLR start "rule__SensorInterface__Group_3__0"
    // InternalSensidl.g:1063:1: rule__SensorInterface__Group_3__0 : rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 ;
    public final void rule__SensorInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1067:1: ( rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 )
            // InternalSensidl.g:1068:2: rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__SensorInterface__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorInterface__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group_3__0"


    // $ANTLR start "rule__SensorInterface__Group_3__0__Impl"
    // InternalSensidl.g:1075:1: rule__SensorInterface__Group_3__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1079:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1080:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1080:1: ( 'with identifier' )
            // InternalSensidl.g:1081:1: 'with identifier'
            {
             before(grammarAccess.getSensorInterfaceAccess().getWithIdentifierKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSensorInterfaceAccess().getWithIdentifierKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group_3__0__Impl"


    // $ANTLR start "rule__SensorInterface__Group_3__1"
    // InternalSensidl.g:1094:1: rule__SensorInterface__Group_3__1 : rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 ;
    public final void rule__SensorInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1098:1: ( rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 )
            // InternalSensidl.g:1099:2: rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__SensorInterface__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorInterface__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group_3__1"


    // $ANTLR start "rule__SensorInterface__Group_3__1__Impl"
    // InternalSensidl.g:1106:1: rule__SensorInterface__Group_3__1__Impl : ( ':' ) ;
    public final void rule__SensorInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1110:1: ( ( ':' ) )
            // InternalSensidl.g:1111:1: ( ':' )
            {
            // InternalSensidl.g:1111:1: ( ':' )
            // InternalSensidl.g:1112:1: ':'
            {
             before(grammarAccess.getSensorInterfaceAccess().getColonKeyword_3_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSensorInterfaceAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group_3__1__Impl"


    // $ANTLR start "rule__SensorInterface__Group_3__2"
    // InternalSensidl.g:1125:1: rule__SensorInterface__Group_3__2 : rule__SensorInterface__Group_3__2__Impl ;
    public final void rule__SensorInterface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1129:1: ( rule__SensorInterface__Group_3__2__Impl )
            // InternalSensidl.g:1130:2: rule__SensorInterface__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorInterface__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group_3__2"


    // $ANTLR start "rule__SensorInterface__Group_3__2__Impl"
    // InternalSensidl.g:1136:1: rule__SensorInterface__Group_3__2__Impl : ( ( rule__SensorInterface__IDAssignment_3_2 ) ) ;
    public final void rule__SensorInterface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1140:1: ( ( ( rule__SensorInterface__IDAssignment_3_2 ) ) )
            // InternalSensidl.g:1141:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            {
            // InternalSensidl.g:1141:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            // InternalSensidl.g:1142:1: ( rule__SensorInterface__IDAssignment_3_2 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getIDAssignment_3_2()); 
            // InternalSensidl.g:1143:1: ( rule__SensorInterface__IDAssignment_3_2 )
            // InternalSensidl.g:1143:2: rule__SensorInterface__IDAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__SensorInterface__IDAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorInterfaceAccess().getIDAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group_3__2__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__0"
    // InternalSensidl.g:1159:1: rule__EncodingSettings__Group__0 : rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 ;
    public final void rule__EncodingSettings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1163:1: ( rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 )
            // InternalSensidl.g:1164:2: rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EncodingSettings__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__0"


    // $ANTLR start "rule__EncodingSettings__Group__0__Impl"
    // InternalSensidl.g:1171:1: rule__EncodingSettings__Group__0__Impl : ( 'encoding' ) ;
    public final void rule__EncodingSettings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1175:1: ( ( 'encoding' ) )
            // InternalSensidl.g:1176:1: ( 'encoding' )
            {
            // InternalSensidl.g:1176:1: ( 'encoding' )
            // InternalSensidl.g:1177:1: 'encoding'
            {
             before(grammarAccess.getEncodingSettingsAccess().getEncodingKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEncodingSettingsAccess().getEncodingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__0__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__1"
    // InternalSensidl.g:1190:1: rule__EncodingSettings__Group__1 : rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 ;
    public final void rule__EncodingSettings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1194:1: ( rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 )
            // InternalSensidl.g:1195:2: rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EncodingSettings__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__1"


    // $ANTLR start "rule__EncodingSettings__Group__1__Impl"
    // InternalSensidl.g:1202:1: rule__EncodingSettings__Group__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1206:1: ( ( ':' ) )
            // InternalSensidl.g:1207:1: ( ':' )
            {
            // InternalSensidl.g:1207:1: ( ':' )
            // InternalSensidl.g:1208:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEncodingSettingsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__1__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__2"
    // InternalSensidl.g:1221:1: rule__EncodingSettings__Group__2 : rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 ;
    public final void rule__EncodingSettings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1225:1: ( rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 )
            // InternalSensidl.g:1226:2: rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__EncodingSettings__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__2"


    // $ANTLR start "rule__EncodingSettings__Group__2__Impl"
    // InternalSensidl.g:1233:1: rule__EncodingSettings__Group__2__Impl : ( ( rule__EncodingSettings__CodingAssignment_2 ) ) ;
    public final void rule__EncodingSettings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1237:1: ( ( ( rule__EncodingSettings__CodingAssignment_2 ) ) )
            // InternalSensidl.g:1238:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            {
            // InternalSensidl.g:1238:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            // InternalSensidl.g:1239:1: ( rule__EncodingSettings__CodingAssignment_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getCodingAssignment_2()); 
            // InternalSensidl.g:1240:1: ( rule__EncodingSettings__CodingAssignment_2 )
            // InternalSensidl.g:1240:2: rule__EncodingSettings__CodingAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EncodingSettings__CodingAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEncodingSettingsAccess().getCodingAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__2__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__3"
    // InternalSensidl.g:1250:1: rule__EncodingSettings__Group__3 : rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 ;
    public final void rule__EncodingSettings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1254:1: ( rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 )
            // InternalSensidl.g:1255:2: rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__EncodingSettings__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__3"


    // $ANTLR start "rule__EncodingSettings__Group__3__Impl"
    // InternalSensidl.g:1262:1: rule__EncodingSettings__Group__3__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1266:1: ( ( ',' ) )
            // InternalSensidl.g:1267:1: ( ',' )
            {
            // InternalSensidl.g:1267:1: ( ',' )
            // InternalSensidl.g:1268:1: ','
            {
             before(grammarAccess.getEncodingSettingsAccess().getCommaKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEncodingSettingsAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__3__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__4"
    // InternalSensidl.g:1281:1: rule__EncodingSettings__Group__4 : rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 ;
    public final void rule__EncodingSettings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1285:1: ( rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 )
            // InternalSensidl.g:1286:2: rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__EncodingSettings__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__4"


    // $ANTLR start "rule__EncodingSettings__Group__4__Impl"
    // InternalSensidl.g:1293:1: rule__EncodingSettings__Group__4__Impl : ( 'endianness' ) ;
    public final void rule__EncodingSettings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1297:1: ( ( 'endianness' ) )
            // InternalSensidl.g:1298:1: ( 'endianness' )
            {
            // InternalSensidl.g:1298:1: ( 'endianness' )
            // InternalSensidl.g:1299:1: 'endianness'
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEncodingSettingsAccess().getEndiannessKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__4__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__5"
    // InternalSensidl.g:1312:1: rule__EncodingSettings__Group__5 : rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 ;
    public final void rule__EncodingSettings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1316:1: ( rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 )
            // InternalSensidl.g:1317:2: rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__EncodingSettings__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__5"


    // $ANTLR start "rule__EncodingSettings__Group__5__Impl"
    // InternalSensidl.g:1324:1: rule__EncodingSettings__Group__5__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1328:1: ( ( ':' ) )
            // InternalSensidl.g:1329:1: ( ':' )
            {
            // InternalSensidl.g:1329:1: ( ':' )
            // InternalSensidl.g:1330:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEncodingSettingsAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__5__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__6"
    // InternalSensidl.g:1343:1: rule__EncodingSettings__Group__6 : rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 ;
    public final void rule__EncodingSettings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1347:1: ( rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 )
            // InternalSensidl.g:1348:2: rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__EncodingSettings__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__6"


    // $ANTLR start "rule__EncodingSettings__Group__6__Impl"
    // InternalSensidl.g:1355:1: rule__EncodingSettings__Group__6__Impl : ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) ;
    public final void rule__EncodingSettings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1359:1: ( ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) )
            // InternalSensidl.g:1360:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            {
            // InternalSensidl.g:1360:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            // InternalSensidl.g:1361:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessAssignment_6()); 
            // InternalSensidl.g:1362:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            // InternalSensidl.g:1362:2: rule__EncodingSettings__EndiannessAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__EncodingSettings__EndiannessAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEncodingSettingsAccess().getEndiannessAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__6__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__7"
    // InternalSensidl.g:1372:1: rule__EncodingSettings__Group__7 : rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 ;
    public final void rule__EncodingSettings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1376:1: ( rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 )
            // InternalSensidl.g:1377:2: rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__EncodingSettings__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__7"


    // $ANTLR start "rule__EncodingSettings__Group__7__Impl"
    // InternalSensidl.g:1384:1: rule__EncodingSettings__Group__7__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1388:1: ( ( ',' ) )
            // InternalSensidl.g:1389:1: ( ',' )
            {
            // InternalSensidl.g:1389:1: ( ',' )
            // InternalSensidl.g:1390:1: ','
            {
             before(grammarAccess.getEncodingSettingsAccess().getCommaKeyword_7()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEncodingSettingsAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__7__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__8"
    // InternalSensidl.g:1403:1: rule__EncodingSettings__Group__8 : rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 ;
    public final void rule__EncodingSettings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1407:1: ( rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 )
            // InternalSensidl.g:1408:2: rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__EncodingSettings__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__8"


    // $ANTLR start "rule__EncodingSettings__Group__8__Impl"
    // InternalSensidl.g:1415:1: rule__EncodingSettings__Group__8__Impl : ( 'alignment' ) ;
    public final void rule__EncodingSettings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1419:1: ( ( 'alignment' ) )
            // InternalSensidl.g:1420:1: ( 'alignment' )
            {
            // InternalSensidl.g:1420:1: ( 'alignment' )
            // InternalSensidl.g:1421:1: 'alignment'
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentKeyword_8()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEncodingSettingsAccess().getAlignmentKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__8__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__9"
    // InternalSensidl.g:1434:1: rule__EncodingSettings__Group__9 : rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 ;
    public final void rule__EncodingSettings__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1438:1: ( rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 )
            // InternalSensidl.g:1439:2: rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__EncodingSettings__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__9"


    // $ANTLR start "rule__EncodingSettings__Group__9__Impl"
    // InternalSensidl.g:1446:1: rule__EncodingSettings__Group__9__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1450:1: ( ( ':' ) )
            // InternalSensidl.g:1451:1: ( ':' )
            {
            // InternalSensidl.g:1451:1: ( ':' )
            // InternalSensidl.g:1452:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_9()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEncodingSettingsAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__9__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__10"
    // InternalSensidl.g:1465:1: rule__EncodingSettings__Group__10 : rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 ;
    public final void rule__EncodingSettings__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1469:1: ( rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 )
            // InternalSensidl.g:1470:2: rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__EncodingSettings__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__10"


    // $ANTLR start "rule__EncodingSettings__Group__10__Impl"
    // InternalSensidl.g:1477:1: rule__EncodingSettings__Group__10__Impl : ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) ;
    public final void rule__EncodingSettings__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1481:1: ( ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) )
            // InternalSensidl.g:1482:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            {
            // InternalSensidl.g:1482:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            // InternalSensidl.g:1483:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentAssignment_10()); 
            // InternalSensidl.g:1484:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            // InternalSensidl.g:1484:2: rule__EncodingSettings__AlignmentAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__EncodingSettings__AlignmentAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getEncodingSettingsAccess().getAlignmentAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__10__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__11"
    // InternalSensidl.g:1494:1: rule__EncodingSettings__Group__11 : rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 ;
    public final void rule__EncodingSettings__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1498:1: ( rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 )
            // InternalSensidl.g:1499:2: rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12
            {
            pushFollow(FOLLOW_17);
            rule__EncodingSettings__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__11"


    // $ANTLR start "rule__EncodingSettings__Group__11__Impl"
    // InternalSensidl.g:1506:1: rule__EncodingSettings__Group__11__Impl : ( 'BIT' ) ;
    public final void rule__EncodingSettings__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1510:1: ( ( 'BIT' ) )
            // InternalSensidl.g:1511:1: ( 'BIT' )
            {
            // InternalSensidl.g:1511:1: ( 'BIT' )
            // InternalSensidl.g:1512:1: 'BIT'
            {
             before(grammarAccess.getEncodingSettingsAccess().getBITKeyword_11()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEncodingSettingsAccess().getBITKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__11__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__12"
    // InternalSensidl.g:1525:1: rule__EncodingSettings__Group__12 : rule__EncodingSettings__Group__12__Impl ;
    public final void rule__EncodingSettings__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1529:1: ( rule__EncodingSettings__Group__12__Impl )
            // InternalSensidl.g:1530:2: rule__EncodingSettings__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__12"


    // $ANTLR start "rule__EncodingSettings__Group__12__Impl"
    // InternalSensidl.g:1536:1: rule__EncodingSettings__Group__12__Impl : ( ( rule__EncodingSettings__Group_12__0 )? ) ;
    public final void rule__EncodingSettings__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1540:1: ( ( ( rule__EncodingSettings__Group_12__0 )? ) )
            // InternalSensidl.g:1541:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            {
            // InternalSensidl.g:1541:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            // InternalSensidl.g:1542:1: ( rule__EncodingSettings__Group_12__0 )?
            {
             before(grammarAccess.getEncodingSettingsAccess().getGroup_12()); 
            // InternalSensidl.g:1543:1: ( rule__EncodingSettings__Group_12__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSensidl.g:1543:2: rule__EncodingSettings__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EncodingSettings__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEncodingSettingsAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__12__Impl"


    // $ANTLR start "rule__EncodingSettings__Group_12__0"
    // InternalSensidl.g:1579:1: rule__EncodingSettings__Group_12__0 : rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 ;
    public final void rule__EncodingSettings__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1583:1: ( rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 )
            // InternalSensidl.g:1584:2: rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1
            {
            pushFollow(FOLLOW_8);
            rule__EncodingSettings__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group_12__0"


    // $ANTLR start "rule__EncodingSettings__Group_12__0__Impl"
    // InternalSensidl.g:1591:1: rule__EncodingSettings__Group_12__0__Impl : ( 'with identifier' ) ;
    public final void rule__EncodingSettings__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1595:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1596:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1596:1: ( 'with identifier' )
            // InternalSensidl.g:1597:1: 'with identifier'
            {
             before(grammarAccess.getEncodingSettingsAccess().getWithIdentifierKeyword_12_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEncodingSettingsAccess().getWithIdentifierKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group_12__0__Impl"


    // $ANTLR start "rule__EncodingSettings__Group_12__1"
    // InternalSensidl.g:1610:1: rule__EncodingSettings__Group_12__1 : rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 ;
    public final void rule__EncodingSettings__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1614:1: ( rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 )
            // InternalSensidl.g:1615:2: rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2
            {
            pushFollow(FOLLOW_9);
            rule__EncodingSettings__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group_12__1"


    // $ANTLR start "rule__EncodingSettings__Group_12__1__Impl"
    // InternalSensidl.g:1622:1: rule__EncodingSettings__Group_12__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1626:1: ( ( ':' ) )
            // InternalSensidl.g:1627:1: ( ':' )
            {
            // InternalSensidl.g:1627:1: ( ':' )
            // InternalSensidl.g:1628:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_12_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEncodingSettingsAccess().getColonKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group_12__1__Impl"


    // $ANTLR start "rule__EncodingSettings__Group_12__2"
    // InternalSensidl.g:1641:1: rule__EncodingSettings__Group_12__2 : rule__EncodingSettings__Group_12__2__Impl ;
    public final void rule__EncodingSettings__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1645:1: ( rule__EncodingSettings__Group_12__2__Impl )
            // InternalSensidl.g:1646:2: rule__EncodingSettings__Group_12__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EncodingSettings__Group_12__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group_12__2"


    // $ANTLR start "rule__EncodingSettings__Group_12__2__Impl"
    // InternalSensidl.g:1652:1: rule__EncodingSettings__Group_12__2__Impl : ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) ;
    public final void rule__EncodingSettings__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1656:1: ( ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) )
            // InternalSensidl.g:1657:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            {
            // InternalSensidl.g:1657:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            // InternalSensidl.g:1658:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getIDAssignment_12_2()); 
            // InternalSensidl.g:1659:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            // InternalSensidl.g:1659:2: rule__EncodingSettings__IDAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__EncodingSettings__IDAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getEncodingSettingsAccess().getIDAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group_12__2__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__0"
    // InternalSensidl.g:1675:1: rule__SensorDataDescription__Group__0 : rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 ;
    public final void rule__SensorDataDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1679:1: ( rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 )
            // InternalSensidl.g:1680:2: rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__SensorDataDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorDataDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__0"


    // $ANTLR start "rule__SensorDataDescription__Group__0__Impl"
    // InternalSensidl.g:1687:1: rule__SensorDataDescription__Group__0__Impl : ( 'sensorData' ) ;
    public final void rule__SensorDataDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1691:1: ( ( 'sensorData' ) )
            // InternalSensidl.g:1692:1: ( 'sensorData' )
            {
            // InternalSensidl.g:1692:1: ( 'sensorData' )
            // InternalSensidl.g:1693:1: 'sensorData'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getSensorDataKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSensorDataDescriptionAccess().getSensorDataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__0__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__1"
    // InternalSensidl.g:1706:1: rule__SensorDataDescription__Group__1 : rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 ;
    public final void rule__SensorDataDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1710:1: ( rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 )
            // InternalSensidl.g:1711:2: rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__SensorDataDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorDataDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__1"


    // $ANTLR start "rule__SensorDataDescription__Group__1__Impl"
    // InternalSensidl.g:1718:1: rule__SensorDataDescription__Group__1__Impl : ( () ) ;
    public final void rule__SensorDataDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1722:1: ( ( () ) )
            // InternalSensidl.g:1723:1: ( () )
            {
            // InternalSensidl.g:1723:1: ( () )
            // InternalSensidl.g:1724:1: ()
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getSensorDataDescriptionAction_1()); 
            // InternalSensidl.g:1725:1: ()
            // InternalSensidl.g:1727:1: 
            {
            }

             after(grammarAccess.getSensorDataDescriptionAccess().getSensorDataDescriptionAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__1__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__2"
    // InternalSensidl.g:1737:1: rule__SensorDataDescription__Group__2 : rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 ;
    public final void rule__SensorDataDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1741:1: ( rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 )
            // InternalSensidl.g:1742:2: rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__SensorDataDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorDataDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__2"


    // $ANTLR start "rule__SensorDataDescription__Group__2__Impl"
    // InternalSensidl.g:1749:1: rule__SensorDataDescription__Group__2__Impl : ( ( rule__SensorDataDescription__Group_2__0 )? ) ;
    public final void rule__SensorDataDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1753:1: ( ( ( rule__SensorDataDescription__Group_2__0 )? ) )
            // InternalSensidl.g:1754:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            {
            // InternalSensidl.g:1754:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            // InternalSensidl.g:1755:1: ( rule__SensorDataDescription__Group_2__0 )?
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getGroup_2()); 
            // InternalSensidl.g:1756:1: ( rule__SensorDataDescription__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSensidl.g:1756:2: rule__SensorDataDescription__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SensorDataDescription__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorDataDescriptionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__2__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__3"
    // InternalSensidl.g:1766:1: rule__SensorDataDescription__Group__3 : rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 ;
    public final void rule__SensorDataDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1770:1: ( rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 )
            // InternalSensidl.g:1771:2: rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__SensorDataDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorDataDescription__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__3"


    // $ANTLR start "rule__SensorDataDescription__Group__3__Impl"
    // InternalSensidl.g:1778:1: rule__SensorDataDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__SensorDataDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1782:1: ( ( '{' ) )
            // InternalSensidl.g:1783:1: ( '{' )
            {
            // InternalSensidl.g:1783:1: ( '{' )
            // InternalSensidl.g:1784:1: '{'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSensorDataDescriptionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__3__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__4"
    // InternalSensidl.g:1797:1: rule__SensorDataDescription__Group__4 : rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 ;
    public final void rule__SensorDataDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1801:1: ( rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 )
            // InternalSensidl.g:1802:2: rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__SensorDataDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorDataDescription__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__4"


    // $ANTLR start "rule__SensorDataDescription__Group__4__Impl"
    // InternalSensidl.g:1809:1: rule__SensorDataDescription__Group__4__Impl : ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) ;
    public final void rule__SensorDataDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1813:1: ( ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) )
            // InternalSensidl.g:1814:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            {
            // InternalSensidl.g:1814:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            // InternalSensidl.g:1815:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDataSetsAssignment_4()); 
            // InternalSensidl.g:1816:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSensidl.g:1816:2: rule__SensorDataDescription__DataSetsAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__SensorDataDescription__DataSetsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSensorDataDescriptionAccess().getDataSetsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__4__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__5"
    // InternalSensidl.g:1826:1: rule__SensorDataDescription__Group__5 : rule__SensorDataDescription__Group__5__Impl ;
    public final void rule__SensorDataDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1830:1: ( rule__SensorDataDescription__Group__5__Impl )
            // InternalSensidl.g:1831:2: rule__SensorDataDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorDataDescription__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__5"


    // $ANTLR start "rule__SensorDataDescription__Group__5__Impl"
    // InternalSensidl.g:1837:1: rule__SensorDataDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__SensorDataDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1841:1: ( ( '}' ) )
            // InternalSensidl.g:1842:1: ( '}' )
            {
            // InternalSensidl.g:1842:1: ( '}' )
            // InternalSensidl.g:1843:1: '}'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSensorDataDescriptionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__5__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group_2__0"
    // InternalSensidl.g:1868:1: rule__SensorDataDescription__Group_2__0 : rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 ;
    public final void rule__SensorDataDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1872:1: ( rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 )
            // InternalSensidl.g:1873:2: rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__SensorDataDescription__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorDataDescription__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_2__0"


    // $ANTLR start "rule__SensorDataDescription__Group_2__0__Impl"
    // InternalSensidl.g:1880:1: rule__SensorDataDescription__Group_2__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorDataDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1884:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1885:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1885:1: ( 'with identifier' )
            // InternalSensidl.g:1886:1: 'with identifier'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getWithIdentifierKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSensorDataDescriptionAccess().getWithIdentifierKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_2__0__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group_2__1"
    // InternalSensidl.g:1899:1: rule__SensorDataDescription__Group_2__1 : rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 ;
    public final void rule__SensorDataDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1903:1: ( rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 )
            // InternalSensidl.g:1904:2: rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__SensorDataDescription__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorDataDescription__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_2__1"


    // $ANTLR start "rule__SensorDataDescription__Group_2__1__Impl"
    // InternalSensidl.g:1911:1: rule__SensorDataDescription__Group_2__1__Impl : ( ':' ) ;
    public final void rule__SensorDataDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1915:1: ( ( ':' ) )
            // InternalSensidl.g:1916:1: ( ':' )
            {
            // InternalSensidl.g:1916:1: ( ':' )
            // InternalSensidl.g:1917:1: ':'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getColonKeyword_2_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSensorDataDescriptionAccess().getColonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_2__1__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group_2__2"
    // InternalSensidl.g:1930:1: rule__SensorDataDescription__Group_2__2 : rule__SensorDataDescription__Group_2__2__Impl ;
    public final void rule__SensorDataDescription__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1934:1: ( rule__SensorDataDescription__Group_2__2__Impl )
            // InternalSensidl.g:1935:2: rule__SensorDataDescription__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorDataDescription__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_2__2"


    // $ANTLR start "rule__SensorDataDescription__Group_2__2__Impl"
    // InternalSensidl.g:1941:1: rule__SensorDataDescription__Group_2__2__Impl : ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) ;
    public final void rule__SensorDataDescription__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1945:1: ( ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) )
            // InternalSensidl.g:1946:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            {
            // InternalSensidl.g:1946:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            // InternalSensidl.g:1947:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIDAssignment_2_2()); 
            // InternalSensidl.g:1948:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            // InternalSensidl.g:1948:2: rule__SensorDataDescription__IDAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SensorDataDescription__IDAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorDataDescriptionAccess().getIDAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_2__2__Impl"


    // $ANTLR start "rule__DataSet__Group__0"
    // InternalSensidl.g:1964:1: rule__DataSet__Group__0 : rule__DataSet__Group__0__Impl rule__DataSet__Group__1 ;
    public final void rule__DataSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1968:1: ( rule__DataSet__Group__0__Impl rule__DataSet__Group__1 )
            // InternalSensidl.g:1969:2: rule__DataSet__Group__0__Impl rule__DataSet__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__0"


    // $ANTLR start "rule__DataSet__Group__0__Impl"
    // InternalSensidl.g:1976:1: rule__DataSet__Group__0__Impl : ( 'dataSet' ) ;
    public final void rule__DataSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1980:1: ( ( 'dataSet' ) )
            // InternalSensidl.g:1981:1: ( 'dataSet' )
            {
            // InternalSensidl.g:1981:1: ( 'dataSet' )
            // InternalSensidl.g:1982:1: 'dataSet'
            {
             before(grammarAccess.getDataSetAccess().getDataSetKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getDataSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__0__Impl"


    // $ANTLR start "rule__DataSet__Group__1"
    // InternalSensidl.g:1995:1: rule__DataSet__Group__1 : rule__DataSet__Group__1__Impl rule__DataSet__Group__2 ;
    public final void rule__DataSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1999:1: ( rule__DataSet__Group__1__Impl rule__DataSet__Group__2 )
            // InternalSensidl.g:2000:2: rule__DataSet__Group__1__Impl rule__DataSet__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__DataSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__1"


    // $ANTLR start "rule__DataSet__Group__1__Impl"
    // InternalSensidl.g:2007:1: rule__DataSet__Group__1__Impl : ( ( rule__DataSet__NameAssignment_1 ) ) ;
    public final void rule__DataSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2011:1: ( ( ( rule__DataSet__NameAssignment_1 ) ) )
            // InternalSensidl.g:2012:1: ( ( rule__DataSet__NameAssignment_1 ) )
            {
            // InternalSensidl.g:2012:1: ( ( rule__DataSet__NameAssignment_1 ) )
            // InternalSensidl.g:2013:1: ( rule__DataSet__NameAssignment_1 )
            {
             before(grammarAccess.getDataSetAccess().getNameAssignment_1()); 
            // InternalSensidl.g:2014:1: ( rule__DataSet__NameAssignment_1 )
            // InternalSensidl.g:2014:2: rule__DataSet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__1__Impl"


    // $ANTLR start "rule__DataSet__Group__2"
    // InternalSensidl.g:2024:1: rule__DataSet__Group__2 : rule__DataSet__Group__2__Impl rule__DataSet__Group__3 ;
    public final void rule__DataSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2028:1: ( rule__DataSet__Group__2__Impl rule__DataSet__Group__3 )
            // InternalSensidl.g:2029:2: rule__DataSet__Group__2__Impl rule__DataSet__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__DataSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__2"


    // $ANTLR start "rule__DataSet__Group__2__Impl"
    // InternalSensidl.g:2036:1: rule__DataSet__Group__2__Impl : ( ( rule__DataSet__Group_2__0 )? ) ;
    public final void rule__DataSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2040:1: ( ( ( rule__DataSet__Group_2__0 )? ) )
            // InternalSensidl.g:2041:1: ( ( rule__DataSet__Group_2__0 )? )
            {
            // InternalSensidl.g:2041:1: ( ( rule__DataSet__Group_2__0 )? )
            // InternalSensidl.g:2042:1: ( rule__DataSet__Group_2__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_2()); 
            // InternalSensidl.g:2043:1: ( rule__DataSet__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSensidl.g:2043:2: rule__DataSet__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSet__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSetAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__2__Impl"


    // $ANTLR start "rule__DataSet__Group__3"
    // InternalSensidl.g:2053:1: rule__DataSet__Group__3 : rule__DataSet__Group__3__Impl rule__DataSet__Group__4 ;
    public final void rule__DataSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2057:1: ( rule__DataSet__Group__3__Impl rule__DataSet__Group__4 )
            // InternalSensidl.g:2058:2: rule__DataSet__Group__3__Impl rule__DataSet__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__DataSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__3"


    // $ANTLR start "rule__DataSet__Group__3__Impl"
    // InternalSensidl.g:2065:1: rule__DataSet__Group__3__Impl : ( ( rule__DataSet__Group_3__0 )* ) ;
    public final void rule__DataSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2069:1: ( ( ( rule__DataSet__Group_3__0 )* ) )
            // InternalSensidl.g:2070:1: ( ( rule__DataSet__Group_3__0 )* )
            {
            // InternalSensidl.g:2070:1: ( ( rule__DataSet__Group_3__0 )* )
            // InternalSensidl.g:2071:1: ( rule__DataSet__Group_3__0 )*
            {
             before(grammarAccess.getDataSetAccess().getGroup_3()); 
            // InternalSensidl.g:2072:1: ( rule__DataSet__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSensidl.g:2072:2: rule__DataSet__Group_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__DataSet__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDataSetAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__3__Impl"


    // $ANTLR start "rule__DataSet__Group__4"
    // InternalSensidl.g:2082:1: rule__DataSet__Group__4 : rule__DataSet__Group__4__Impl rule__DataSet__Group__5 ;
    public final void rule__DataSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2086:1: ( rule__DataSet__Group__4__Impl rule__DataSet__Group__5 )
            // InternalSensidl.g:2087:2: rule__DataSet__Group__4__Impl rule__DataSet__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__DataSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__4"


    // $ANTLR start "rule__DataSet__Group__4__Impl"
    // InternalSensidl.g:2094:1: rule__DataSet__Group__4__Impl : ( ( rule__DataSet__Group_4__0 )? ) ;
    public final void rule__DataSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2098:1: ( ( ( rule__DataSet__Group_4__0 )? ) )
            // InternalSensidl.g:2099:1: ( ( rule__DataSet__Group_4__0 )? )
            {
            // InternalSensidl.g:2099:1: ( ( rule__DataSet__Group_4__0 )? )
            // InternalSensidl.g:2100:1: ( rule__DataSet__Group_4__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_4()); 
            // InternalSensidl.g:2101:1: ( rule__DataSet__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSensidl.g:2101:2: rule__DataSet__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSet__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSetAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__4__Impl"


    // $ANTLR start "rule__DataSet__Group__5"
    // InternalSensidl.g:2111:1: rule__DataSet__Group__5 : rule__DataSet__Group__5__Impl rule__DataSet__Group__6 ;
    public final void rule__DataSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2115:1: ( rule__DataSet__Group__5__Impl rule__DataSet__Group__6 )
            // InternalSensidl.g:2116:2: rule__DataSet__Group__5__Impl rule__DataSet__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__DataSet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__5"


    // $ANTLR start "rule__DataSet__Group__5__Impl"
    // InternalSensidl.g:2123:1: rule__DataSet__Group__5__Impl : ( ( rule__DataSet__DescriptionAssignment_5 )? ) ;
    public final void rule__DataSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2127:1: ( ( ( rule__DataSet__DescriptionAssignment_5 )? ) )
            // InternalSensidl.g:2128:1: ( ( rule__DataSet__DescriptionAssignment_5 )? )
            {
            // InternalSensidl.g:2128:1: ( ( rule__DataSet__DescriptionAssignment_5 )? )
            // InternalSensidl.g:2129:1: ( rule__DataSet__DescriptionAssignment_5 )?
            {
             before(grammarAccess.getDataSetAccess().getDescriptionAssignment_5()); 
            // InternalSensidl.g:2130:1: ( rule__DataSet__DescriptionAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DESCRIPTION) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSensidl.g:2130:2: rule__DataSet__DescriptionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSet__DescriptionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSetAccess().getDescriptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__5__Impl"


    // $ANTLR start "rule__DataSet__Group__6"
    // InternalSensidl.g:2140:1: rule__DataSet__Group__6 : rule__DataSet__Group__6__Impl rule__DataSet__Group__7 ;
    public final void rule__DataSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2144:1: ( rule__DataSet__Group__6__Impl rule__DataSet__Group__7 )
            // InternalSensidl.g:2145:2: rule__DataSet__Group__6__Impl rule__DataSet__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__DataSet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSet__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__6"


    // $ANTLR start "rule__DataSet__Group__6__Impl"
    // InternalSensidl.g:2152:1: rule__DataSet__Group__6__Impl : ( '{' ) ;
    public final void rule__DataSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2156:1: ( ( '{' ) )
            // InternalSensidl.g:2157:1: ( '{' )
            {
            // InternalSensidl.g:2157:1: ( '{' )
            // InternalSensidl.g:2158:1: '{'
            {
             before(grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__6__Impl"


    // $ANTLR start "rule__DataSet__Group__7"
    // InternalSensidl.g:2171:1: rule__DataSet__Group__7 : rule__DataSet__Group__7__Impl rule__DataSet__Group__8 ;
    public final void rule__DataSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2175:1: ( rule__DataSet__Group__7__Impl rule__DataSet__Group__8 )
            // InternalSensidl.g:2176:2: rule__DataSet__Group__7__Impl rule__DataSet__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__DataSet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSet__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__7"


    // $ANTLR start "rule__DataSet__Group__7__Impl"
    // InternalSensidl.g:2183:1: rule__DataSet__Group__7__Impl : ( ( rule__DataSet__DataAssignment_7 )* ) ;
    public final void rule__DataSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2187:1: ( ( ( rule__DataSet__DataAssignment_7 )* ) )
            // InternalSensidl.g:2188:1: ( ( rule__DataSet__DataAssignment_7 )* )
            {
            // InternalSensidl.g:2188:1: ( ( rule__DataSet__DataAssignment_7 )* )
            // InternalSensidl.g:2189:1: ( rule__DataSet__DataAssignment_7 )*
            {
             before(grammarAccess.getDataSetAccess().getDataAssignment_7()); 
            // InternalSensidl.g:2190:1: ( rule__DataSet__DataAssignment_7 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSensidl.g:2190:2: rule__DataSet__DataAssignment_7
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__DataSet__DataAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDataSetAccess().getDataAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__7__Impl"


    // $ANTLR start "rule__DataSet__Group__8"
    // InternalSensidl.g:2200:1: rule__DataSet__Group__8 : rule__DataSet__Group__8__Impl ;
    public final void rule__DataSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2204:1: ( rule__DataSet__Group__8__Impl )
            // InternalSensidl.g:2205:2: rule__DataSet__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSet__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__8"


    // $ANTLR start "rule__DataSet__Group__8__Impl"
    // InternalSensidl.g:2211:1: rule__DataSet__Group__8__Impl : ( '}' ) ;
    public final void rule__DataSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2215:1: ( ( '}' ) )
            // InternalSensidl.g:2216:1: ( '}' )
            {
            // InternalSensidl.g:2216:1: ( '}' )
            // InternalSensidl.g:2217:1: '}'
            {
             before(grammarAccess.getDataSetAccess().getRightCurlyBracketKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__8__Impl"


    // $ANTLR start "rule__DataSet__Group_2__0"
    // InternalSensidl.g:2248:1: rule__DataSet__Group_2__0 : rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 ;
    public final void rule__DataSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2252:1: ( rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 )
            // InternalSensidl.g:2253:2: rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__DataSet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSet__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_2__0"


    // $ANTLR start "rule__DataSet__Group_2__0__Impl"
    // InternalSensidl.g:2260:1: rule__DataSet__Group_2__0__Impl : ( 'uses' ) ;
    public final void rule__DataSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2264:1: ( ( 'uses' ) )
            // InternalSensidl.g:2265:1: ( 'uses' )
            {
            // InternalSensidl.g:2265:1: ( 'uses' )
            // InternalSensidl.g:2266:1: 'uses'
            {
             before(grammarAccess.getDataSetAccess().getUsesKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getUsesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_2__0__Impl"


    // $ANTLR start "rule__DataSet__Group_2__1"
    // InternalSensidl.g:2279:1: rule__DataSet__Group_2__1 : rule__DataSet__Group_2__1__Impl ;
    public final void rule__DataSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2283:1: ( rule__DataSet__Group_2__1__Impl )
            // InternalSensidl.g:2284:2: rule__DataSet__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSet__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_2__1"


    // $ANTLR start "rule__DataSet__Group_2__1__Impl"
    // InternalSensidl.g:2290:1: rule__DataSet__Group_2__1__Impl : ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) ) ;
    public final void rule__DataSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2294:1: ( ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) ) )
            // InternalSensidl.g:2295:1: ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) )
            {
            // InternalSensidl.g:2295:1: ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) )
            // InternalSensidl.g:2296:1: ( rule__DataSet__ParentDataSetAssignment_2_1 )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetAssignment_2_1()); 
            // InternalSensidl.g:2297:1: ( rule__DataSet__ParentDataSetAssignment_2_1 )
            // InternalSensidl.g:2297:2: rule__DataSet__ParentDataSetAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSet__ParentDataSetAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSetAccess().getParentDataSetAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_2__1__Impl"


    // $ANTLR start "rule__DataSet__Group_3__0"
    // InternalSensidl.g:2311:1: rule__DataSet__Group_3__0 : rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 ;
    public final void rule__DataSet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2315:1: ( rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 )
            // InternalSensidl.g:2316:2: rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__DataSet__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSet__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_3__0"


    // $ANTLR start "rule__DataSet__Group_3__0__Impl"
    // InternalSensidl.g:2323:1: rule__DataSet__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DataSet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2327:1: ( ( ',' ) )
            // InternalSensidl.g:2328:1: ( ',' )
            {
            // InternalSensidl.g:2328:1: ( ',' )
            // InternalSensidl.g:2329:1: ','
            {
             before(grammarAccess.getDataSetAccess().getCommaKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_3__0__Impl"


    // $ANTLR start "rule__DataSet__Group_3__1"
    // InternalSensidl.g:2342:1: rule__DataSet__Group_3__1 : rule__DataSet__Group_3__1__Impl ;
    public final void rule__DataSet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2346:1: ( rule__DataSet__Group_3__1__Impl )
            // InternalSensidl.g:2347:2: rule__DataSet__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSet__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_3__1"


    // $ANTLR start "rule__DataSet__Group_3__1__Impl"
    // InternalSensidl.g:2353:1: rule__DataSet__Group_3__1__Impl : ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) ) ;
    public final void rule__DataSet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2357:1: ( ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) ) )
            // InternalSensidl.g:2358:1: ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) )
            {
            // InternalSensidl.g:2358:1: ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) )
            // InternalSensidl.g:2359:1: ( rule__DataSet__ParentDataSetAssignment_3_1 )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetAssignment_3_1()); 
            // InternalSensidl.g:2360:1: ( rule__DataSet__ParentDataSetAssignment_3_1 )
            // InternalSensidl.g:2360:2: rule__DataSet__ParentDataSetAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSet__ParentDataSetAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSetAccess().getParentDataSetAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_3__1__Impl"


    // $ANTLR start "rule__DataSet__Group_4__0"
    // InternalSensidl.g:2374:1: rule__DataSet__Group_4__0 : rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1 ;
    public final void rule__DataSet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2378:1: ( rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1 )
            // InternalSensidl.g:2379:2: rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__DataSet__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSet__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_4__0"


    // $ANTLR start "rule__DataSet__Group_4__0__Impl"
    // InternalSensidl.g:2386:1: rule__DataSet__Group_4__0__Impl : ( 'with identifier' ) ;
    public final void rule__DataSet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2390:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:2391:1: ( 'with identifier' )
            {
            // InternalSensidl.g:2391:1: ( 'with identifier' )
            // InternalSensidl.g:2392:1: 'with identifier'
            {
             before(grammarAccess.getDataSetAccess().getWithIdentifierKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getWithIdentifierKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_4__0__Impl"


    // $ANTLR start "rule__DataSet__Group_4__1"
    // InternalSensidl.g:2405:1: rule__DataSet__Group_4__1 : rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2 ;
    public final void rule__DataSet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2409:1: ( rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2 )
            // InternalSensidl.g:2410:2: rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__DataSet__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSet__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_4__1"


    // $ANTLR start "rule__DataSet__Group_4__1__Impl"
    // InternalSensidl.g:2417:1: rule__DataSet__Group_4__1__Impl : ( ':' ) ;
    public final void rule__DataSet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2421:1: ( ( ':' ) )
            // InternalSensidl.g:2422:1: ( ':' )
            {
            // InternalSensidl.g:2422:1: ( ':' )
            // InternalSensidl.g:2423:1: ':'
            {
             before(grammarAccess.getDataSetAccess().getColonKeyword_4_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_4__1__Impl"


    // $ANTLR start "rule__DataSet__Group_4__2"
    // InternalSensidl.g:2436:1: rule__DataSet__Group_4__2 : rule__DataSet__Group_4__2__Impl ;
    public final void rule__DataSet__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2440:1: ( rule__DataSet__Group_4__2__Impl )
            // InternalSensidl.g:2441:2: rule__DataSet__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSet__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_4__2"


    // $ANTLR start "rule__DataSet__Group_4__2__Impl"
    // InternalSensidl.g:2447:1: rule__DataSet__Group_4__2__Impl : ( ( rule__DataSet__IDAssignment_4_2 ) ) ;
    public final void rule__DataSet__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2451:1: ( ( ( rule__DataSet__IDAssignment_4_2 ) ) )
            // InternalSensidl.g:2452:1: ( ( rule__DataSet__IDAssignment_4_2 ) )
            {
            // InternalSensidl.g:2452:1: ( ( rule__DataSet__IDAssignment_4_2 ) )
            // InternalSensidl.g:2453:1: ( rule__DataSet__IDAssignment_4_2 )
            {
             before(grammarAccess.getDataSetAccess().getIDAssignment_4_2()); 
            // InternalSensidl.g:2454:1: ( rule__DataSet__IDAssignment_4_2 )
            // InternalSensidl.g:2454:2: rule__DataSet__IDAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__DataSet__IDAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDataSetAccess().getIDAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_4__2__Impl"


    // $ANTLR start "rule__MeasurementData__Group__0"
    // InternalSensidl.g:2470:1: rule__MeasurementData__Group__0 : rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 ;
    public final void rule__MeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2474:1: ( rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 )
            // InternalSensidl.g:2475:2: rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__MeasurementData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__0"


    // $ANTLR start "rule__MeasurementData__Group__0__Impl"
    // InternalSensidl.g:2482:1: rule__MeasurementData__Group__0__Impl : ( ( rule__MeasurementData__NameAssignment_0 ) ) ;
    public final void rule__MeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2486:1: ( ( ( rule__MeasurementData__NameAssignment_0 ) ) )
            // InternalSensidl.g:2487:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:2487:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            // InternalSensidl.g:2488:1: ( rule__MeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:2489:1: ( rule__MeasurementData__NameAssignment_0 )
            // InternalSensidl.g:2489:2: rule__MeasurementData__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group__1"
    // InternalSensidl.g:2499:1: rule__MeasurementData__Group__1 : rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 ;
    public final void rule__MeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2503:1: ( rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 )
            // InternalSensidl.g:2504:2: rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__MeasurementData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__1"


    // $ANTLR start "rule__MeasurementData__Group__1__Impl"
    // InternalSensidl.g:2511:1: rule__MeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2515:1: ( ( 'as' ) )
            // InternalSensidl.g:2516:1: ( 'as' )
            {
            // InternalSensidl.g:2516:1: ( 'as' )
            // InternalSensidl.g:2517:1: 'as'
            {
             before(grammarAccess.getMeasurementDataAccess().getAsKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__1__Impl"


    // $ANTLR start "rule__MeasurementData__Group__2"
    // InternalSensidl.g:2530:1: rule__MeasurementData__Group__2 : rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 ;
    public final void rule__MeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2534:1: ( rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 )
            // InternalSensidl.g:2535:2: rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__MeasurementData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__2"


    // $ANTLR start "rule__MeasurementData__Group__2__Impl"
    // InternalSensidl.g:2542:1: rule__MeasurementData__Group__2__Impl : ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2546:1: ( ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) )
            // InternalSensidl.g:2547:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            {
            // InternalSensidl.g:2547:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            // InternalSensidl.g:2548:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getDataTypeAssignment_2()); 
            // InternalSensidl.g:2549:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            // InternalSensidl.g:2549:2: rule__MeasurementData__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__DataTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getDataTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__2__Impl"


    // $ANTLR start "rule__MeasurementData__Group__3"
    // InternalSensidl.g:2559:1: rule__MeasurementData__Group__3 : rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 ;
    public final void rule__MeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2563:1: ( rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 )
            // InternalSensidl.g:2564:2: rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__MeasurementData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__3"


    // $ANTLR start "rule__MeasurementData__Group__3__Impl"
    // InternalSensidl.g:2571:1: rule__MeasurementData__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2575:1: ( ( 'in' ) )
            // InternalSensidl.g:2576:1: ( 'in' )
            {
            // InternalSensidl.g:2576:1: ( 'in' )
            // InternalSensidl.g:2577:1: 'in'
            {
             before(grammarAccess.getMeasurementDataAccess().getInKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__3__Impl"


    // $ANTLR start "rule__MeasurementData__Group__4"
    // InternalSensidl.g:2590:1: rule__MeasurementData__Group__4 : rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 ;
    public final void rule__MeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2594:1: ( rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 )
            // InternalSensidl.g:2595:2: rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__MeasurementData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__4"


    // $ANTLR start "rule__MeasurementData__Group__4__Impl"
    // InternalSensidl.g:2602:1: rule__MeasurementData__Group__4__Impl : ( ( rule__MeasurementData__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2606:1: ( ( ( rule__MeasurementData__UnitAssignment_4 ) ) )
            // InternalSensidl.g:2607:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            {
            // InternalSensidl.g:2607:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            // InternalSensidl.g:2608:1: ( rule__MeasurementData__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataAccess().getUnitAssignment_4()); 
            // InternalSensidl.g:2609:1: ( rule__MeasurementData__UnitAssignment_4 )
            // InternalSensidl.g:2609:2: rule__MeasurementData__UnitAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__UnitAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getUnitAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__4__Impl"


    // $ANTLR start "rule__MeasurementData__Group__5"
    // InternalSensidl.g:2619:1: rule__MeasurementData__Group__5 : rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 ;
    public final void rule__MeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2623:1: ( rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 )
            // InternalSensidl.g:2624:2: rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__MeasurementData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__5"


    // $ANTLR start "rule__MeasurementData__Group__5__Impl"
    // InternalSensidl.g:2631:1: rule__MeasurementData__Group__5__Impl : ( ( rule__MeasurementData__Group_5__0 )? ) ;
    public final void rule__MeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2635:1: ( ( ( rule__MeasurementData__Group_5__0 )? ) )
            // InternalSensidl.g:2636:1: ( ( rule__MeasurementData__Group_5__0 )? )
            {
            // InternalSensidl.g:2636:1: ( ( rule__MeasurementData__Group_5__0 )? )
            // InternalSensidl.g:2637:1: ( rule__MeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_5()); 
            // InternalSensidl.g:2638:1: ( rule__MeasurementData__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSensidl.g:2638:2: rule__MeasurementData__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__5__Impl"


    // $ANTLR start "rule__MeasurementData__Group__6"
    // InternalSensidl.g:2648:1: rule__MeasurementData__Group__6 : rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 ;
    public final void rule__MeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2652:1: ( rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 )
            // InternalSensidl.g:2653:2: rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__MeasurementData__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__6"


    // $ANTLR start "rule__MeasurementData__Group__6__Impl"
    // InternalSensidl.g:2660:1: rule__MeasurementData__Group__6__Impl : ( ( rule__MeasurementData__Alternatives_6 )? ) ;
    public final void rule__MeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2664:1: ( ( ( rule__MeasurementData__Alternatives_6 )? ) )
            // InternalSensidl.g:2665:1: ( ( rule__MeasurementData__Alternatives_6 )? )
            {
            // InternalSensidl.g:2665:1: ( ( rule__MeasurementData__Alternatives_6 )? )
            // InternalSensidl.g:2666:1: ( rule__MeasurementData__Alternatives_6 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getAlternatives_6()); 
            // InternalSensidl.g:2667:1: ( rule__MeasurementData__Alternatives_6 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSensidl.g:2667:2: rule__MeasurementData__Alternatives_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__Alternatives_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__6__Impl"


    // $ANTLR start "rule__MeasurementData__Group__7"
    // InternalSensidl.g:2677:1: rule__MeasurementData__Group__7 : rule__MeasurementData__Group__7__Impl ;
    public final void rule__MeasurementData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2681:1: ( rule__MeasurementData__Group__7__Impl )
            // InternalSensidl.g:2682:2: rule__MeasurementData__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__7"


    // $ANTLR start "rule__MeasurementData__Group__7__Impl"
    // InternalSensidl.g:2688:1: rule__MeasurementData__Group__7__Impl : ( ( rule__MeasurementData__DescriptionAssignment_7 )? ) ;
    public final void rule__MeasurementData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2692:1: ( ( ( rule__MeasurementData__DescriptionAssignment_7 )? ) )
            // InternalSensidl.g:2693:1: ( ( rule__MeasurementData__DescriptionAssignment_7 )? )
            {
            // InternalSensidl.g:2693:1: ( ( rule__MeasurementData__DescriptionAssignment_7 )? )
            // InternalSensidl.g:2694:1: ( rule__MeasurementData__DescriptionAssignment_7 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionAssignment_7()); 
            // InternalSensidl.g:2695:1: ( rule__MeasurementData__DescriptionAssignment_7 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_DESCRIPTION) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSensidl.g:2695:2: rule__MeasurementData__DescriptionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__DescriptionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataAccess().getDescriptionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__7__Impl"


    // $ANTLR start "rule__MeasurementData__Group_5__0"
    // InternalSensidl.g:2721:1: rule__MeasurementData__Group_5__0 : rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 ;
    public final void rule__MeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2725:1: ( rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 )
            // InternalSensidl.g:2726:2: rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__MeasurementData__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_5__0"


    // $ANTLR start "rule__MeasurementData__Group_5__0__Impl"
    // InternalSensidl.g:2733:1: rule__MeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2737:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:2738:1: ( 'with identifier' )
            {
            // InternalSensidl.g:2738:1: ( 'with identifier' )
            // InternalSensidl.g:2739:1: 'with identifier'
            {
             before(grammarAccess.getMeasurementDataAccess().getWithIdentifierKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getWithIdentifierKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_5__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group_5__1"
    // InternalSensidl.g:2752:1: rule__MeasurementData__Group_5__1 : rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 ;
    public final void rule__MeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2756:1: ( rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 )
            // InternalSensidl.g:2757:2: rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__MeasurementData__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_5__1"


    // $ANTLR start "rule__MeasurementData__Group_5__1__Impl"
    // InternalSensidl.g:2764:1: rule__MeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2768:1: ( ( ':' ) )
            // InternalSensidl.g:2769:1: ( ':' )
            {
            // InternalSensidl.g:2769:1: ( ':' )
            // InternalSensidl.g:2770:1: ':'
            {
             before(grammarAccess.getMeasurementDataAccess().getColonKeyword_5_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_5__1__Impl"


    // $ANTLR start "rule__MeasurementData__Group_5__2"
    // InternalSensidl.g:2783:1: rule__MeasurementData__Group_5__2 : rule__MeasurementData__Group_5__2__Impl ;
    public final void rule__MeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2787:1: ( rule__MeasurementData__Group_5__2__Impl )
            // InternalSensidl.g:2788:2: rule__MeasurementData__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_5__2"


    // $ANTLR start "rule__MeasurementData__Group_5__2__Impl"
    // InternalSensidl.g:2794:1: rule__MeasurementData__Group_5__2__Impl : ( ( rule__MeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2798:1: ( ( ( rule__MeasurementData__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:2799:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:2799:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            // InternalSensidl.g:2800:1: ( rule__MeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:2801:1: ( rule__MeasurementData__IDAssignment_5_2 )
            // InternalSensidl.g:2801:2: rule__MeasurementData__IDAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__IDAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getIDAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_5__2__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_0__0"
    // InternalSensidl.g:2817:1: rule__MeasurementData__Group_6_0__0 : rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1 ;
    public final void rule__MeasurementData__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2821:1: ( rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1 )
            // InternalSensidl.g:2822:2: rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1
            {
            pushFollow(FOLLOW_30);
            rule__MeasurementData__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_0__0"


    // $ANTLR start "rule__MeasurementData__Group_6_0__0__Impl"
    // InternalSensidl.g:2829:1: rule__MeasurementData__Group_6_0__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2833:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:2834:1: ( 'adjusted' )
            {
            // InternalSensidl.g:2834:1: ( 'adjusted' )
            // InternalSensidl.g:2835:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_0__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_0__1"
    // InternalSensidl.g:2848:1: rule__MeasurementData__Group_6_0__1 : rule__MeasurementData__Group_6_0__1__Impl ;
    public final void rule__MeasurementData__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2852:1: ( rule__MeasurementData__Group_6_0__1__Impl )
            // InternalSensidl.g:2853:2: rule__MeasurementData__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_0__1"


    // $ANTLR start "rule__MeasurementData__Group_6_0__1__Impl"
    // InternalSensidl.g:2859:1: rule__MeasurementData__Group_6_0__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) ) ;
    public final void rule__MeasurementData__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2863:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) ) )
            // InternalSensidl.g:2864:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) )
            {
            // InternalSensidl.g:2864:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) )
            // InternalSensidl.g:2865:1: ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_0_1()); 
            // InternalSensidl.g:2866:1: ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 )
            // InternalSensidl.g:2866:2: rule__MeasurementData__AdjustmentsAssignment_6_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__AdjustmentsAssignment_6_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_0__1__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_1__0"
    // InternalSensidl.g:2880:1: rule__MeasurementData__Group_6_1__0 : rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1 ;
    public final void rule__MeasurementData__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2884:1: ( rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1 )
            // InternalSensidl.g:2885:2: rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1
            {
            pushFollow(FOLLOW_31);
            rule__MeasurementData__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_1__0"


    // $ANTLR start "rule__MeasurementData__Group_6_1__0__Impl"
    // InternalSensidl.g:2892:1: rule__MeasurementData__Group_6_1__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2896:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:2897:1: ( 'adjusted' )
            {
            // InternalSensidl.g:2897:1: ( 'adjusted' )
            // InternalSensidl.g:2898:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_1__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_1__1"
    // InternalSensidl.g:2911:1: rule__MeasurementData__Group_6_1__1 : rule__MeasurementData__Group_6_1__1__Impl ;
    public final void rule__MeasurementData__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2915:1: ( rule__MeasurementData__Group_6_1__1__Impl )
            // InternalSensidl.g:2916:2: rule__MeasurementData__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_1__1"


    // $ANTLR start "rule__MeasurementData__Group_6_1__1__Impl"
    // InternalSensidl.g:2922:1: rule__MeasurementData__Group_6_1__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) ) ;
    public final void rule__MeasurementData__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2926:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) ) )
            // InternalSensidl.g:2927:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) )
            {
            // InternalSensidl.g:2927:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) )
            // InternalSensidl.g:2928:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_1_1()); 
            // InternalSensidl.g:2929:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 )
            // InternalSensidl.g:2929:2: rule__MeasurementData__AdjustmentsAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__AdjustmentsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_1__1__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_2__0"
    // InternalSensidl.g:2943:1: rule__MeasurementData__Group_6_2__0 : rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 ;
    public final void rule__MeasurementData__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2947:1: ( rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 )
            // InternalSensidl.g:2948:2: rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1
            {
            pushFollow(FOLLOW_30);
            rule__MeasurementData__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__0"


    // $ANTLR start "rule__MeasurementData__Group_6_2__0__Impl"
    // InternalSensidl.g:2955:1: rule__MeasurementData__Group_6_2__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2959:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:2960:1: ( 'adjusted' )
            {
            // InternalSensidl.g:2960:1: ( 'adjusted' )
            // InternalSensidl.g:2961:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_2__1"
    // InternalSensidl.g:2974:1: rule__MeasurementData__Group_6_2__1 : rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2 ;
    public final void rule__MeasurementData__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2978:1: ( rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2 )
            // InternalSensidl.g:2979:2: rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2
            {
            pushFollow(FOLLOW_11);
            rule__MeasurementData__Group_6_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_6_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__1"


    // $ANTLR start "rule__MeasurementData__Group_6_2__1__Impl"
    // InternalSensidl.g:2986:1: rule__MeasurementData__Group_6_2__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) ;
    public final void rule__MeasurementData__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2990:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) )
            // InternalSensidl.g:2991:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            {
            // InternalSensidl.g:2991:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            // InternalSensidl.g:2992:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_1()); 
            // InternalSensidl.g:2993:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            // InternalSensidl.g:2993:2: rule__MeasurementData__AdjustmentsAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__AdjustmentsAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__1__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_2__2"
    // InternalSensidl.g:3003:1: rule__MeasurementData__Group_6_2__2 : rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3 ;
    public final void rule__MeasurementData__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3007:1: ( rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3 )
            // InternalSensidl.g:3008:2: rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3
            {
            pushFollow(FOLLOW_31);
            rule__MeasurementData__Group_6_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_6_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__2"


    // $ANTLR start "rule__MeasurementData__Group_6_2__2__Impl"
    // InternalSensidl.g:3015:1: rule__MeasurementData__Group_6_2__2__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3019:1: ( ( ',' ) )
            // InternalSensidl.g:3020:1: ( ',' )
            {
            // InternalSensidl.g:3020:1: ( ',' )
            // InternalSensidl.g:3021:1: ','
            {
             before(grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_2_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__2__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_2__3"
    // InternalSensidl.g:3034:1: rule__MeasurementData__Group_6_2__3 : rule__MeasurementData__Group_6_2__3__Impl ;
    public final void rule__MeasurementData__Group_6_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3038:1: ( rule__MeasurementData__Group_6_2__3__Impl )
            // InternalSensidl.g:3039:2: rule__MeasurementData__Group_6_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_6_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__3"


    // $ANTLR start "rule__MeasurementData__Group_6_2__3__Impl"
    // InternalSensidl.g:3045:1: rule__MeasurementData__Group_6_2__3__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) ) ;
    public final void rule__MeasurementData__Group_6_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3049:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) ) )
            // InternalSensidl.g:3050:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) )
            {
            // InternalSensidl.g:3050:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) )
            // InternalSensidl.g:3051:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_3()); 
            // InternalSensidl.g:3052:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 )
            // InternalSensidl.g:3052:2: rule__MeasurementData__AdjustmentsAssignment_6_2_3
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__AdjustmentsAssignment_6_2_3();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__3__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__0"
    // InternalSensidl.g:3070:1: rule__NonMeasurementData__Group__0 : rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 ;
    public final void rule__NonMeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3074:1: ( rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 )
            // InternalSensidl.g:3075:2: rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__NonMeasurementData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__0"


    // $ANTLR start "rule__NonMeasurementData__Group__0__Impl"
    // InternalSensidl.g:3082:1: rule__NonMeasurementData__Group__0__Impl : ( ( rule__NonMeasurementData__NameAssignment_0 ) ) ;
    public final void rule__NonMeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3086:1: ( ( ( rule__NonMeasurementData__NameAssignment_0 ) ) )
            // InternalSensidl.g:3087:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:3087:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            // InternalSensidl.g:3088:1: ( rule__NonMeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:3089:1: ( rule__NonMeasurementData__NameAssignment_0 )
            // InternalSensidl.g:3089:2: rule__NonMeasurementData__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__1"
    // InternalSensidl.g:3099:1: rule__NonMeasurementData__Group__1 : rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 ;
    public final void rule__NonMeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3103:1: ( rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 )
            // InternalSensidl.g:3104:2: rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__NonMeasurementData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__1"


    // $ANTLR start "rule__NonMeasurementData__Group__1__Impl"
    // InternalSensidl.g:3111:1: rule__NonMeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__NonMeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3115:1: ( ( 'as' ) )
            // InternalSensidl.g:3116:1: ( 'as' )
            {
            // InternalSensidl.g:3116:1: ( 'as' )
            // InternalSensidl.g:3117:1: 'as'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAsKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__2"
    // InternalSensidl.g:3130:1: rule__NonMeasurementData__Group__2 : rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 ;
    public final void rule__NonMeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3134:1: ( rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 )
            // InternalSensidl.g:3135:2: rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__NonMeasurementData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__2"


    // $ANTLR start "rule__NonMeasurementData__Group__2__Impl"
    // InternalSensidl.g:3142:1: rule__NonMeasurementData__Group__2__Impl : ( ( rule__NonMeasurementData__Alternatives_2 ) ) ;
    public final void rule__NonMeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3146:1: ( ( ( rule__NonMeasurementData__Alternatives_2 ) ) )
            // InternalSensidl.g:3147:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            {
            // InternalSensidl.g:3147:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            // InternalSensidl.g:3148:1: ( rule__NonMeasurementData__Alternatives_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAlternatives_2()); 
            // InternalSensidl.g:3149:1: ( rule__NonMeasurementData__Alternatives_2 )
            // InternalSensidl.g:3149:2: rule__NonMeasurementData__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__2__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__3"
    // InternalSensidl.g:3159:1: rule__NonMeasurementData__Group__3 : rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 ;
    public final void rule__NonMeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3163:1: ( rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 )
            // InternalSensidl.g:3164:2: rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__NonMeasurementData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__3"


    // $ANTLR start "rule__NonMeasurementData__Group__3__Impl"
    // InternalSensidl.g:3171:1: rule__NonMeasurementData__Group__3__Impl : ( ( rule__NonMeasurementData__ConstantAssignment_3 )? ) ;
    public final void rule__NonMeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3175:1: ( ( ( rule__NonMeasurementData__ConstantAssignment_3 )? ) )
            // InternalSensidl.g:3176:1: ( ( rule__NonMeasurementData__ConstantAssignment_3 )? )
            {
            // InternalSensidl.g:3176:1: ( ( rule__NonMeasurementData__ConstantAssignment_3 )? )
            // InternalSensidl.g:3177:1: ( rule__NonMeasurementData__ConstantAssignment_3 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantAssignment_3()); 
            // InternalSensidl.g:3178:1: ( rule__NonMeasurementData__ConstantAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==55) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSensidl.g:3178:2: rule__NonMeasurementData__ConstantAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__ConstantAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getConstantAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__3__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__4"
    // InternalSensidl.g:3188:1: rule__NonMeasurementData__Group__4 : rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 ;
    public final void rule__NonMeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3192:1: ( rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 )
            // InternalSensidl.g:3193:2: rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__NonMeasurementData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__4"


    // $ANTLR start "rule__NonMeasurementData__Group__4__Impl"
    // InternalSensidl.g:3200:1: rule__NonMeasurementData__Group__4__Impl : ( ( rule__NonMeasurementData__Group_4__0 )? ) ;
    public final void rule__NonMeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3204:1: ( ( ( rule__NonMeasurementData__Group_4__0 )? ) )
            // InternalSensidl.g:3205:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            {
            // InternalSensidl.g:3205:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            // InternalSensidl.g:3206:1: ( rule__NonMeasurementData__Group_4__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_4()); 
            // InternalSensidl.g:3207:1: ( rule__NonMeasurementData__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSensidl.g:3207:2: rule__NonMeasurementData__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__4__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__5"
    // InternalSensidl.g:3217:1: rule__NonMeasurementData__Group__5 : rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 ;
    public final void rule__NonMeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3221:1: ( rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 )
            // InternalSensidl.g:3222:2: rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__NonMeasurementData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__5"


    // $ANTLR start "rule__NonMeasurementData__Group__5__Impl"
    // InternalSensidl.g:3229:1: rule__NonMeasurementData__Group__5__Impl : ( ( rule__NonMeasurementData__Group_5__0 )? ) ;
    public final void rule__NonMeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3233:1: ( ( ( rule__NonMeasurementData__Group_5__0 )? ) )
            // InternalSensidl.g:3234:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            {
            // InternalSensidl.g:3234:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            // InternalSensidl.g:3235:1: ( rule__NonMeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_5()); 
            // InternalSensidl.g:3236:1: ( rule__NonMeasurementData__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSensidl.g:3236:2: rule__NonMeasurementData__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__5__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__6"
    // InternalSensidl.g:3246:1: rule__NonMeasurementData__Group__6 : rule__NonMeasurementData__Group__6__Impl ;
    public final void rule__NonMeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3250:1: ( rule__NonMeasurementData__Group__6__Impl )
            // InternalSensidl.g:3251:2: rule__NonMeasurementData__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__6"


    // $ANTLR start "rule__NonMeasurementData__Group__6__Impl"
    // InternalSensidl.g:3257:1: rule__NonMeasurementData__Group__6__Impl : ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? ) ;
    public final void rule__NonMeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3261:1: ( ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? ) )
            // InternalSensidl.g:3262:1: ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? )
            {
            // InternalSensidl.g:3262:1: ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? )
            // InternalSensidl.g:3263:1: ( rule__NonMeasurementData__DescriptionAssignment_6 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionAssignment_6()); 
            // InternalSensidl.g:3264:1: ( rule__NonMeasurementData__DescriptionAssignment_6 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_DESCRIPTION) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSensidl.g:3264:2: rule__NonMeasurementData__DescriptionAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__DescriptionAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getDescriptionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__6__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_4__0"
    // InternalSensidl.g:3288:1: rule__NonMeasurementData__Group_4__0 : rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 ;
    public final void rule__NonMeasurementData__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3292:1: ( rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 )
            // InternalSensidl.g:3293:2: rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1
            {
            pushFollow(FOLLOW_34);
            rule__NonMeasurementData__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_4__0"


    // $ANTLR start "rule__NonMeasurementData__Group_4__0__Impl"
    // InternalSensidl.g:3300:1: rule__NonMeasurementData__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__NonMeasurementData__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3304:1: ( ( 'value' ) )
            // InternalSensidl.g:3305:1: ( 'value' )
            {
            // InternalSensidl.g:3305:1: ( 'value' )
            // InternalSensidl.g:3306:1: 'value'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_4__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_4__1"
    // InternalSensidl.g:3319:1: rule__NonMeasurementData__Group_4__1 : rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 ;
    public final void rule__NonMeasurementData__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3323:1: ( rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 )
            // InternalSensidl.g:3324:2: rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__NonMeasurementData__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_4__1"


    // $ANTLR start "rule__NonMeasurementData__Group_4__1__Impl"
    // InternalSensidl.g:3331:1: rule__NonMeasurementData__Group_4__1__Impl : ( '=' ) ;
    public final void rule__NonMeasurementData__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3335:1: ( ( '=' ) )
            // InternalSensidl.g:3336:1: ( '=' )
            {
            // InternalSensidl.g:3336:1: ( '=' )
            // InternalSensidl.g:3337:1: '='
            {
             before(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_4_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_4__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_4__2"
    // InternalSensidl.g:3350:1: rule__NonMeasurementData__Group_4__2 : rule__NonMeasurementData__Group_4__2__Impl ;
    public final void rule__NonMeasurementData__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3354:1: ( rule__NonMeasurementData__Group_4__2__Impl )
            // InternalSensidl.g:3355:2: rule__NonMeasurementData__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_4__2"


    // $ANTLR start "rule__NonMeasurementData__Group_4__2__Impl"
    // InternalSensidl.g:3361:1: rule__NonMeasurementData__Group_4__2__Impl : ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) ) ;
    public final void rule__NonMeasurementData__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3365:1: ( ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) ) )
            // InternalSensidl.g:3366:1: ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) )
            {
            // InternalSensidl.g:3366:1: ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) )
            // InternalSensidl.g:3367:1: ( rule__NonMeasurementData__ValueAssignment_4_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_4_2()); 
            // InternalSensidl.g:3368:1: ( rule__NonMeasurementData__ValueAssignment_4_2 )
            // InternalSensidl.g:3368:2: rule__NonMeasurementData__ValueAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__ValueAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_4__2__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_5__0"
    // InternalSensidl.g:3384:1: rule__NonMeasurementData__Group_5__0 : rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 ;
    public final void rule__NonMeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3388:1: ( rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 )
            // InternalSensidl.g:3389:2: rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__NonMeasurementData__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5__0"


    // $ANTLR start "rule__NonMeasurementData__Group_5__0__Impl"
    // InternalSensidl.g:3396:1: rule__NonMeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__NonMeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3400:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:3401:1: ( 'with identifier' )
            {
            // InternalSensidl.g:3401:1: ( 'with identifier' )
            // InternalSensidl.g:3402:1: 'with identifier'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getWithIdentifierKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getWithIdentifierKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_5__1"
    // InternalSensidl.g:3415:1: rule__NonMeasurementData__Group_5__1 : rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2 ;
    public final void rule__NonMeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3419:1: ( rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2 )
            // InternalSensidl.g:3420:2: rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__NonMeasurementData__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5__1"


    // $ANTLR start "rule__NonMeasurementData__Group_5__1__Impl"
    // InternalSensidl.g:3427:1: rule__NonMeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__NonMeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3431:1: ( ( ':' ) )
            // InternalSensidl.g:3432:1: ( ':' )
            {
            // InternalSensidl.g:3432:1: ( ':' )
            // InternalSensidl.g:3433:1: ':'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getColonKeyword_5_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_5__2"
    // InternalSensidl.g:3446:1: rule__NonMeasurementData__Group_5__2 : rule__NonMeasurementData__Group_5__2__Impl ;
    public final void rule__NonMeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3450:1: ( rule__NonMeasurementData__Group_5__2__Impl )
            // InternalSensidl.g:3451:2: rule__NonMeasurementData__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5__2"


    // $ANTLR start "rule__NonMeasurementData__Group_5__2__Impl"
    // InternalSensidl.g:3457:1: rule__NonMeasurementData__Group_5__2__Impl : ( ( rule__NonMeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__NonMeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3461:1: ( ( ( rule__NonMeasurementData__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:3462:1: ( ( rule__NonMeasurementData__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:3462:1: ( ( rule__NonMeasurementData__IDAssignment_5_2 ) )
            // InternalSensidl.g:3463:1: ( rule__NonMeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:3464:1: ( rule__NonMeasurementData__IDAssignment_5_2 )
            // InternalSensidl.g:3464:2: rule__NonMeasurementData__IDAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__IDAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getIDAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5__2__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__0"
    // InternalSensidl.g:3480:1: rule__MeasurementDataNotAdjustable__Group__0 : rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3484:1: ( rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 )
            // InternalSensidl.g:3485:2: rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__MeasurementDataNotAdjustable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__0"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__0__Impl"
    // InternalSensidl.g:3492:1: rule__MeasurementDataNotAdjustable__Group__0__Impl : ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3496:1: ( ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) )
            // InternalSensidl.g:3497:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            {
            // InternalSensidl.g:3497:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            // InternalSensidl.g:3498:1: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getNameAssignment_0()); 
            // InternalSensidl.g:3499:1: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            // InternalSensidl.g:3499:2: rule__MeasurementDataNotAdjustable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__0__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__1"
    // InternalSensidl.g:3509:1: rule__MeasurementDataNotAdjustable__Group__1 : rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3513:1: ( rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 )
            // InternalSensidl.g:3514:2: rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__MeasurementDataNotAdjustable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__1"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__1__Impl"
    // InternalSensidl.g:3521:1: rule__MeasurementDataNotAdjustable__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3525:1: ( ( 'as' ) )
            // InternalSensidl.g:3526:1: ( 'as' )
            {
            // InternalSensidl.g:3526:1: ( 'as' )
            // InternalSensidl.g:3527:1: 'as'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getAsKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__1__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__2"
    // InternalSensidl.g:3540:1: rule__MeasurementDataNotAdjustable__Group__2 : rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 ;
    public final void rule__MeasurementDataNotAdjustable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3544:1: ( rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 )
            // InternalSensidl.g:3545:2: rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__MeasurementDataNotAdjustable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__2"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__2__Impl"
    // InternalSensidl.g:3552:1: rule__MeasurementDataNotAdjustable__Group__2__Impl : ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3556:1: ( ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) )
            // InternalSensidl.g:3557:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            {
            // InternalSensidl.g:3557:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            // InternalSensidl.g:3558:1: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeAssignment_2()); 
            // InternalSensidl.g:3559:1: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            // InternalSensidl.g:3559:2: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__DataTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__2__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__3"
    // InternalSensidl.g:3569:1: rule__MeasurementDataNotAdjustable__Group__3 : rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 ;
    public final void rule__MeasurementDataNotAdjustable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3573:1: ( rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 )
            // InternalSensidl.g:3574:2: rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__MeasurementDataNotAdjustable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__3"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__3__Impl"
    // InternalSensidl.g:3581:1: rule__MeasurementDataNotAdjustable__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3585:1: ( ( 'in' ) )
            // InternalSensidl.g:3586:1: ( 'in' )
            {
            // InternalSensidl.g:3586:1: ( 'in' )
            // InternalSensidl.g:3587:1: 'in'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getInKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__3__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__4"
    // InternalSensidl.g:3600:1: rule__MeasurementDataNotAdjustable__Group__4 : rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 ;
    public final void rule__MeasurementDataNotAdjustable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3604:1: ( rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 )
            // InternalSensidl.g:3605:2: rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__MeasurementDataNotAdjustable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__4"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__4__Impl"
    // InternalSensidl.g:3612:1: rule__MeasurementDataNotAdjustable__Group__4__Impl : ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3616:1: ( ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) )
            // InternalSensidl.g:3617:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            {
            // InternalSensidl.g:3617:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            // InternalSensidl.g:3618:1: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitAssignment_4()); 
            // InternalSensidl.g:3619:1: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            // InternalSensidl.g:3619:2: rule__MeasurementDataNotAdjustable__UnitAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__UnitAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__4__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__5"
    // InternalSensidl.g:3629:1: rule__MeasurementDataNotAdjustable__Group__5 : rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 ;
    public final void rule__MeasurementDataNotAdjustable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3633:1: ( rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 )
            // InternalSensidl.g:3634:2: rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__MeasurementDataNotAdjustable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__5"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__5__Impl"
    // InternalSensidl.g:3641:1: rule__MeasurementDataNotAdjustable__Group__5__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3645:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) )
            // InternalSensidl.g:3646:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            {
            // InternalSensidl.g:3646:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            // InternalSensidl.g:3647:1: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_5()); 
            // InternalSensidl.g:3648:1: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSensidl.g:3648:2: rule__MeasurementDataNotAdjustable__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementDataNotAdjustable__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__5__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__6"
    // InternalSensidl.g:3658:1: rule__MeasurementDataNotAdjustable__Group__6 : rule__MeasurementDataNotAdjustable__Group__6__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3662:1: ( rule__MeasurementDataNotAdjustable__Group__6__Impl )
            // InternalSensidl.g:3663:2: rule__MeasurementDataNotAdjustable__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__6"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__6__Impl"
    // InternalSensidl.g:3669:1: rule__MeasurementDataNotAdjustable__Group__6__Impl : ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3673:1: ( ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )? ) )
            // InternalSensidl.g:3674:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )? )
            {
            // InternalSensidl.g:3674:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )? )
            // InternalSensidl.g:3675:1: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionAssignment_6()); 
            // InternalSensidl.g:3676:1: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_DESCRIPTION) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSensidl.g:3676:2: rule__MeasurementDataNotAdjustable__DescriptionAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementDataNotAdjustable__DescriptionAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__6__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_5__0"
    // InternalSensidl.g:3700:1: rule__MeasurementDataNotAdjustable__Group_5__0 : rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3704:1: ( rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 )
            // InternalSensidl.g:3705:2: rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__MeasurementDataNotAdjustable__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_5__0"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_5__0__Impl"
    // InternalSensidl.g:3712:1: rule__MeasurementDataNotAdjustable__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3716:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:3717:1: ( 'with identifier' )
            {
            // InternalSensidl.g:3717:1: ( 'with identifier' )
            // InternalSensidl.g:3718:1: 'with identifier'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getWithIdentifierKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getWithIdentifierKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_5__0__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_5__1"
    // InternalSensidl.g:3731:1: rule__MeasurementDataNotAdjustable__Group_5__1 : rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3735:1: ( rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 )
            // InternalSensidl.g:3736:2: rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__MeasurementDataNotAdjustable__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_5__1"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_5__1__Impl"
    // InternalSensidl.g:3743:1: rule__MeasurementDataNotAdjustable__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3747:1: ( ( ':' ) )
            // InternalSensidl.g:3748:1: ( ':' )
            {
            // InternalSensidl.g:3748:1: ( ':' )
            // InternalSensidl.g:3749:1: ':'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getColonKeyword_5_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_5__1__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_5__2"
    // InternalSensidl.g:3762:1: rule__MeasurementDataNotAdjustable__Group_5__2 : rule__MeasurementDataNotAdjustable__Group_5__2__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3766:1: ( rule__MeasurementDataNotAdjustable__Group_5__2__Impl )
            // InternalSensidl.g:3767:2: rule__MeasurementDataNotAdjustable__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_5__2"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_5__2__Impl"
    // InternalSensidl.g:3773:1: rule__MeasurementDataNotAdjustable__Group_5__2__Impl : ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3777:1: ( ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:3778:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:3778:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            // InternalSensidl.g:3779:1: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:3780:1: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            // InternalSensidl.g:3780:2: rule__MeasurementDataNotAdjustable__IDAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__IDAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getIDAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_5__2__Impl"


    // $ANTLR start "rule__DataRange__Group__0"
    // InternalSensidl.g:3796:1: rule__DataRange__Group__0 : rule__DataRange__Group__0__Impl rule__DataRange__Group__1 ;
    public final void rule__DataRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3800:1: ( rule__DataRange__Group__0__Impl rule__DataRange__Group__1 )
            // InternalSensidl.g:3801:2: rule__DataRange__Group__0__Impl rule__DataRange__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__DataRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group__0"


    // $ANTLR start "rule__DataRange__Group__0__Impl"
    // InternalSensidl.g:3808:1: rule__DataRange__Group__0__Impl : ( 'with range' ) ;
    public final void rule__DataRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3812:1: ( ( 'with range' ) )
            // InternalSensidl.g:3813:1: ( 'with range' )
            {
            // InternalSensidl.g:3813:1: ( 'with range' )
            // InternalSensidl.g:3814:1: 'with range'
            {
             before(grammarAccess.getDataRangeAccess().getWithRangeKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDataRangeAccess().getWithRangeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group__0__Impl"


    // $ANTLR start "rule__DataRange__Group__1"
    // InternalSensidl.g:3827:1: rule__DataRange__Group__1 : rule__DataRange__Group__1__Impl ;
    public final void rule__DataRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3831:1: ( rule__DataRange__Group__1__Impl )
            // InternalSensidl.g:3832:2: rule__DataRange__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataRange__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group__1"


    // $ANTLR start "rule__DataRange__Group__1__Impl"
    // InternalSensidl.g:3838:1: rule__DataRange__Group__1__Impl : ( ( rule__DataRange__RangeAssignment_1 ) ) ;
    public final void rule__DataRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3842:1: ( ( ( rule__DataRange__RangeAssignment_1 ) ) )
            // InternalSensidl.g:3843:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            {
            // InternalSensidl.g:3843:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            // InternalSensidl.g:3844:1: ( rule__DataRange__RangeAssignment_1 )
            {
             before(grammarAccess.getDataRangeAccess().getRangeAssignment_1()); 
            // InternalSensidl.g:3845:1: ( rule__DataRange__RangeAssignment_1 )
            // InternalSensidl.g:3845:2: rule__DataRange__RangeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataRange__RangeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataRangeAccess().getRangeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group__1__Impl"


    // $ANTLR start "rule__Interval__Group__0"
    // InternalSensidl.g:3859:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3863:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // InternalSensidl.g:3864:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Interval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interval__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__0"


    // $ANTLR start "rule__Interval__Group__0__Impl"
    // InternalSensidl.g:3871:1: rule__Interval__Group__0__Impl : ( '[' ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3875:1: ( ( '[' ) )
            // InternalSensidl.g:3876:1: ( '[' )
            {
            // InternalSensidl.g:3876:1: ( '[' )
            // InternalSensidl.g:3877:1: '['
            {
             before(grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__0__Impl"


    // $ANTLR start "rule__Interval__Group__1"
    // InternalSensidl.g:3890:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3894:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // InternalSensidl.g:3895:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Interval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interval__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__1"


    // $ANTLR start "rule__Interval__Group__1__Impl"
    // InternalSensidl.g:3902:1: rule__Interval__Group__1__Impl : ( ( rule__Interval__LowerBoundAssignment_1 ) ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3906:1: ( ( ( rule__Interval__LowerBoundAssignment_1 ) ) )
            // InternalSensidl.g:3907:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            {
            // InternalSensidl.g:3907:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            // InternalSensidl.g:3908:1: ( rule__Interval__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getIntervalAccess().getLowerBoundAssignment_1()); 
            // InternalSensidl.g:3909:1: ( rule__Interval__LowerBoundAssignment_1 )
            // InternalSensidl.g:3909:2: rule__Interval__LowerBoundAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interval__LowerBoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getLowerBoundAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__1__Impl"


    // $ANTLR start "rule__Interval__Group__2"
    // InternalSensidl.g:3919:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl rule__Interval__Group__3 ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3923:1: ( rule__Interval__Group__2__Impl rule__Interval__Group__3 )
            // InternalSensidl.g:3924:2: rule__Interval__Group__2__Impl rule__Interval__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Interval__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interval__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__2"


    // $ANTLR start "rule__Interval__Group__2__Impl"
    // InternalSensidl.g:3931:1: rule__Interval__Group__2__Impl : ( ';' ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3935:1: ( ( ';' ) )
            // InternalSensidl.g:3936:1: ( ';' )
            {
            // InternalSensidl.g:3936:1: ( ';' )
            // InternalSensidl.g:3937:1: ';'
            {
             before(grammarAccess.getIntervalAccess().getSemicolonKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getIntervalAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__2__Impl"


    // $ANTLR start "rule__Interval__Group__3"
    // InternalSensidl.g:3950:1: rule__Interval__Group__3 : rule__Interval__Group__3__Impl rule__Interval__Group__4 ;
    public final void rule__Interval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3954:1: ( rule__Interval__Group__3__Impl rule__Interval__Group__4 )
            // InternalSensidl.g:3955:2: rule__Interval__Group__3__Impl rule__Interval__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__Interval__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interval__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__3"


    // $ANTLR start "rule__Interval__Group__3__Impl"
    // InternalSensidl.g:3962:1: rule__Interval__Group__3__Impl : ( ( rule__Interval__UpperBoundAssignment_3 ) ) ;
    public final void rule__Interval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3966:1: ( ( ( rule__Interval__UpperBoundAssignment_3 ) ) )
            // InternalSensidl.g:3967:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            {
            // InternalSensidl.g:3967:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            // InternalSensidl.g:3968:1: ( rule__Interval__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getIntervalAccess().getUpperBoundAssignment_3()); 
            // InternalSensidl.g:3969:1: ( rule__Interval__UpperBoundAssignment_3 )
            // InternalSensidl.g:3969:2: rule__Interval__UpperBoundAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Interval__UpperBoundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getUpperBoundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__3__Impl"


    // $ANTLR start "rule__Interval__Group__4"
    // InternalSensidl.g:3979:1: rule__Interval__Group__4 : rule__Interval__Group__4__Impl ;
    public final void rule__Interval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3983:1: ( rule__Interval__Group__4__Impl )
            // InternalSensidl.g:3984:2: rule__Interval__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interval__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__4"


    // $ANTLR start "rule__Interval__Group__4__Impl"
    // InternalSensidl.g:3990:1: rule__Interval__Group__4__Impl : ( ']' ) ;
    public final void rule__Interval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3994:1: ( ( ']' ) )
            // InternalSensidl.g:3995:1: ( ']' )
            {
            // InternalSensidl.g:3995:1: ( ']' )
            // InternalSensidl.g:3996:1: ']'
            {
             before(grammarAccess.getIntervalAccess().getRightSquareBracketKeyword_4()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getIntervalAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__4__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group__0"
    // InternalSensidl.g:4019:1: rule__LinearDataConversion__Group__0 : rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 ;
    public final void rule__LinearDataConversion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4023:1: ( rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 )
            // InternalSensidl.g:4024:2: rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__LinearDataConversion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearDataConversion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__0"


    // $ANTLR start "rule__LinearDataConversion__Group__0__Impl"
    // InternalSensidl.g:4031:1: rule__LinearDataConversion__Group__0__Impl : ( 'with scaling factor' ) ;
    public final void rule__LinearDataConversion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4035:1: ( ( 'with scaling factor' ) )
            // InternalSensidl.g:4036:1: ( 'with scaling factor' )
            {
            // InternalSensidl.g:4036:1: ( 'with scaling factor' )
            // InternalSensidl.g:4037:1: 'with scaling factor'
            {
             before(grammarAccess.getLinearDataConversionAccess().getWithScalingFactorKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLinearDataConversionAccess().getWithScalingFactorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__0__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group__1"
    // InternalSensidl.g:4050:1: rule__LinearDataConversion__Group__1 : rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 ;
    public final void rule__LinearDataConversion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4054:1: ( rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 )
            // InternalSensidl.g:4055:2: rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__LinearDataConversion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearDataConversion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__1"


    // $ANTLR start "rule__LinearDataConversion__Group__1__Impl"
    // InternalSensidl.g:4062:1: rule__LinearDataConversion__Group__1__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4066:1: ( ( ':' ) )
            // InternalSensidl.g:4067:1: ( ':' )
            {
            // InternalSensidl.g:4067:1: ( ':' )
            // InternalSensidl.g:4068:1: ':'
            {
             before(grammarAccess.getLinearDataConversionAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLinearDataConversionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__1__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group__2"
    // InternalSensidl.g:4081:1: rule__LinearDataConversion__Group__2 : rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 ;
    public final void rule__LinearDataConversion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4085:1: ( rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 )
            // InternalSensidl.g:4086:2: rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__LinearDataConversion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearDataConversion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__2"


    // $ANTLR start "rule__LinearDataConversion__Group__2__Impl"
    // InternalSensidl.g:4093:1: rule__LinearDataConversion__Group__2__Impl : ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) ;
    public final void rule__LinearDataConversion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4097:1: ( ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) )
            // InternalSensidl.g:4098:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            {
            // InternalSensidl.g:4098:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            // InternalSensidl.g:4099:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorAssignment_2()); 
            // InternalSensidl.g:4100:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            // InternalSensidl.g:4100:2: rule__LinearDataConversion__ScalingFactorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LinearDataConversion__ScalingFactorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionAccess().getScalingFactorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__2__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group__3"
    // InternalSensidl.g:4110:1: rule__LinearDataConversion__Group__3 : rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 ;
    public final void rule__LinearDataConversion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4114:1: ( rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 )
            // InternalSensidl.g:4115:2: rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__LinearDataConversion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearDataConversion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__3"


    // $ANTLR start "rule__LinearDataConversion__Group__3__Impl"
    // InternalSensidl.g:4122:1: rule__LinearDataConversion__Group__3__Impl : ( 'and offset' ) ;
    public final void rule__LinearDataConversion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4126:1: ( ( 'and offset' ) )
            // InternalSensidl.g:4127:1: ( 'and offset' )
            {
            // InternalSensidl.g:4127:1: ( 'and offset' )
            // InternalSensidl.g:4128:1: 'and offset'
            {
             before(grammarAccess.getLinearDataConversionAccess().getAndOffsetKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLinearDataConversionAccess().getAndOffsetKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__3__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group__4"
    // InternalSensidl.g:4141:1: rule__LinearDataConversion__Group__4 : rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 ;
    public final void rule__LinearDataConversion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4145:1: ( rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 )
            // InternalSensidl.g:4146:2: rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__LinearDataConversion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearDataConversion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__4"


    // $ANTLR start "rule__LinearDataConversion__Group__4__Impl"
    // InternalSensidl.g:4153:1: rule__LinearDataConversion__Group__4__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4157:1: ( ( ':' ) )
            // InternalSensidl.g:4158:1: ( ':' )
            {
            // InternalSensidl.g:4158:1: ( ':' )
            // InternalSensidl.g:4159:1: ':'
            {
             before(grammarAccess.getLinearDataConversionAccess().getColonKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLinearDataConversionAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__4__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group__5"
    // InternalSensidl.g:4172:1: rule__LinearDataConversion__Group__5 : rule__LinearDataConversion__Group__5__Impl ;
    public final void rule__LinearDataConversion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4176:1: ( rule__LinearDataConversion__Group__5__Impl )
            // InternalSensidl.g:4177:2: rule__LinearDataConversion__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinearDataConversion__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__5"


    // $ANTLR start "rule__LinearDataConversion__Group__5__Impl"
    // InternalSensidl.g:4183:1: rule__LinearDataConversion__Group__5__Impl : ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) ;
    public final void rule__LinearDataConversion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4187:1: ( ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) )
            // InternalSensidl.g:4188:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            {
            // InternalSensidl.g:4188:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            // InternalSensidl.g:4189:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetAssignment_5()); 
            // InternalSensidl.g:4190:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            // InternalSensidl.g:4190:2: rule__LinearDataConversion__OffsetAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LinearDataConversion__OffsetAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionAccess().getOffsetAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__5__Impl"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__0"
    // InternalSensidl.g:4212:1: rule__LinearDataConversionWithInterval__Group__0 : rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 ;
    public final void rule__LinearDataConversionWithInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4216:1: ( rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 )
            // InternalSensidl.g:4217:2: rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__LinearDataConversionWithInterval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearDataConversionWithInterval__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__0"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__0__Impl"
    // InternalSensidl.g:4224:1: rule__LinearDataConversionWithInterval__Group__0__Impl : ( 'by linear mapping' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4228:1: ( ( 'by linear mapping' ) )
            // InternalSensidl.g:4229:1: ( 'by linear mapping' )
            {
            // InternalSensidl.g:4229:1: ( 'by linear mapping' )
            // InternalSensidl.g:4230:1: 'by linear mapping'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getByLinearMappingKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getByLinearMappingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__0__Impl"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__1"
    // InternalSensidl.g:4243:1: rule__LinearDataConversionWithInterval__Group__1 : rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 ;
    public final void rule__LinearDataConversionWithInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4247:1: ( rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 )
            // InternalSensidl.g:4248:2: rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__LinearDataConversionWithInterval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearDataConversionWithInterval__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__1"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__1__Impl"
    // InternalSensidl.g:4255:1: rule__LinearDataConversionWithInterval__Group__1__Impl : ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4259:1: ( ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) )
            // InternalSensidl.g:4260:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            {
            // InternalSensidl.g:4260:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            // InternalSensidl.g:4261:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalAssignment_1()); 
            // InternalSensidl.g:4262:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            // InternalSensidl.g:4262:2: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LinearDataConversionWithInterval__FromIntervalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__1__Impl"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__2"
    // InternalSensidl.g:4272:1: rule__LinearDataConversionWithInterval__Group__2 : rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 ;
    public final void rule__LinearDataConversionWithInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4276:1: ( rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 )
            // InternalSensidl.g:4277:2: rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__LinearDataConversionWithInterval__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearDataConversionWithInterval__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__2"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__2__Impl"
    // InternalSensidl.g:4284:1: rule__LinearDataConversionWithInterval__Group__2__Impl : ( '=>' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4288:1: ( ( '=>' ) )
            // InternalSensidl.g:4289:1: ( '=>' )
            {
            // InternalSensidl.g:4289:1: ( '=>' )
            // InternalSensidl.g:4290:1: '=>'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getEqualsSignGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__2__Impl"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__3"
    // InternalSensidl.g:4303:1: rule__LinearDataConversionWithInterval__Group__3 : rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4 ;
    public final void rule__LinearDataConversionWithInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4307:1: ( rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4 )
            // InternalSensidl.g:4308:2: rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__LinearDataConversionWithInterval__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearDataConversionWithInterval__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__3"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__3__Impl"
    // InternalSensidl.g:4315:1: rule__LinearDataConversionWithInterval__Group__3__Impl : ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4319:1: ( ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) )
            // InternalSensidl.g:4320:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            {
            // InternalSensidl.g:4320:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            // InternalSensidl.g:4321:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalAssignment_3()); 
            // InternalSensidl.g:4322:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            // InternalSensidl.g:4322:2: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LinearDataConversionWithInterval__ToIntervalAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__3__Impl"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__4"
    // InternalSensidl.g:4332:1: rule__LinearDataConversionWithInterval__Group__4 : rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5 ;
    public final void rule__LinearDataConversionWithInterval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4336:1: ( rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5 )
            // InternalSensidl.g:4337:2: rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__LinearDataConversionWithInterval__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearDataConversionWithInterval__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__4"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__4__Impl"
    // InternalSensidl.g:4344:1: rule__LinearDataConversionWithInterval__Group__4__Impl : ( 'as' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4348:1: ( ( 'as' ) )
            // InternalSensidl.g:4349:1: ( 'as' )
            {
            // InternalSensidl.g:4349:1: ( 'as' )
            // InternalSensidl.g:4350:1: 'as'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getAsKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getAsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__4__Impl"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__5"
    // InternalSensidl.g:4363:1: rule__LinearDataConversionWithInterval__Group__5 : rule__LinearDataConversionWithInterval__Group__5__Impl ;
    public final void rule__LinearDataConversionWithInterval__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4367:1: ( rule__LinearDataConversionWithInterval__Group__5__Impl )
            // InternalSensidl.g:4368:2: rule__LinearDataConversionWithInterval__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinearDataConversionWithInterval__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__5"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__5__Impl"
    // InternalSensidl.g:4374:1: rule__LinearDataConversionWithInterval__Group__5__Impl : ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4378:1: ( ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) ) )
            // InternalSensidl.g:4379:1: ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) )
            {
            // InternalSensidl.g:4379:1: ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) )
            // InternalSensidl.g:4380:1: ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeAssignment_5()); 
            // InternalSensidl.g:4381:1: ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 )
            // InternalSensidl.g:4381:2: rule__LinearDataConversionWithInterval__DataTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LinearDataConversionWithInterval__DataTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__5__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // InternalSensidl.g:4403:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4407:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalSensidl.g:4408:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__0"


    // $ANTLR start "rule__DOUBLE__Group__0__Impl"
    // InternalSensidl.g:4415:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4419:1: ( ( RULE_INT ) )
            // InternalSensidl.g:4420:1: ( RULE_INT )
            {
            // InternalSensidl.g:4420:1: ( RULE_INT )
            // InternalSensidl.g:4421:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group__1"
    // InternalSensidl.g:4432:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4436:1: ( rule__DOUBLE__Group__1__Impl )
            // InternalSensidl.g:4437:2: rule__DOUBLE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__1"


    // $ANTLR start "rule__DOUBLE__Group__1__Impl"
    // InternalSensidl.g:4443:1: rule__DOUBLE__Group__1__Impl : ( ( rule__DOUBLE__Group_1__0 )? ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4447:1: ( ( ( rule__DOUBLE__Group_1__0 )? ) )
            // InternalSensidl.g:4448:1: ( ( rule__DOUBLE__Group_1__0 )? )
            {
            // InternalSensidl.g:4448:1: ( ( rule__DOUBLE__Group_1__0 )? )
            // InternalSensidl.g:4449:1: ( rule__DOUBLE__Group_1__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
            // InternalSensidl.g:4450:1: ( rule__DOUBLE__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==54) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSensidl.g:4450:2: rule__DOUBLE__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DOUBLE__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDOUBLEAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group_1__0"
    // InternalSensidl.g:4464:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4468:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // InternalSensidl.g:4469:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__DOUBLE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_1__0"


    // $ANTLR start "rule__DOUBLE__Group_1__0__Impl"
    // InternalSensidl.g:4476:1: rule__DOUBLE__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4480:1: ( ( '.' ) )
            // InternalSensidl.g:4481:1: ( '.' )
            {
            // InternalSensidl.g:4481:1: ( '.' )
            // InternalSensidl.g:4482:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_1__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group_1__1"
    // InternalSensidl.g:4495:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4499:1: ( rule__DOUBLE__Group_1__1__Impl )
            // InternalSensidl.g:4500:2: rule__DOUBLE__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_1__1"


    // $ANTLR start "rule__DOUBLE__Group_1__1__Impl"
    // InternalSensidl.g:4506:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4510:1: ( ( RULE_INT ) )
            // InternalSensidl.g:4511:1: ( RULE_INT )
            {
            // InternalSensidl.g:4511:1: ( RULE_INT )
            // InternalSensidl.g:4512:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_1__1__Impl"


    // $ANTLR start "rule__UNIT__Group__0"
    // InternalSensidl.g:4527:1: rule__UNIT__Group__0 : rule__UNIT__Group__0__Impl rule__UNIT__Group__1 ;
    public final void rule__UNIT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4531:1: ( rule__UNIT__Group__0__Impl rule__UNIT__Group__1 )
            // InternalSensidl.g:4532:2: rule__UNIT__Group__0__Impl rule__UNIT__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__UNIT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UNIT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__0"


    // $ANTLR start "rule__UNIT__Group__0__Impl"
    // InternalSensidl.g:4539:1: rule__UNIT__Group__0__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4543:1: ( ( ( RULE_ID )* ) )
            // InternalSensidl.g:4544:1: ( ( RULE_ID )* )
            {
            // InternalSensidl.g:4544:1: ( ( RULE_ID )* )
            // InternalSensidl.g:4545:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_0()); 
            // InternalSensidl.g:4546:1: ( RULE_ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==EOF||(LA29_2>=RULE_ID && LA29_2<=RULE_DESCRIPTION)||(LA29_2>=30 && LA29_2<=31)||LA29_2==43) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalSensidl.g:4546:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_24); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getUNITAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__0__Impl"


    // $ANTLR start "rule__UNIT__Group__1"
    // InternalSensidl.g:4556:1: rule__UNIT__Group__1 : rule__UNIT__Group__1__Impl ;
    public final void rule__UNIT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4560:1: ( rule__UNIT__Group__1__Impl )
            // InternalSensidl.g:4561:2: rule__UNIT__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UNIT__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__1"


    // $ANTLR start "rule__UNIT__Group__1__Impl"
    // InternalSensidl.g:4567:1: rule__UNIT__Group__1__Impl : ( ( rule__UNIT__Group_1__0 )* ) ;
    public final void rule__UNIT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4571:1: ( ( ( rule__UNIT__Group_1__0 )* ) )
            // InternalSensidl.g:4572:1: ( ( rule__UNIT__Group_1__0 )* )
            {
            // InternalSensidl.g:4572:1: ( ( rule__UNIT__Group_1__0 )* )
            // InternalSensidl.g:4573:1: ( rule__UNIT__Group_1__0 )*
            {
             before(grammarAccess.getUNITAccess().getGroup_1()); 
            // InternalSensidl.g:4574:1: ( rule__UNIT__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ANY_OTHER) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSensidl.g:4574:2: rule__UNIT__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__UNIT__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getUNITAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__1__Impl"


    // $ANTLR start "rule__UNIT__Group_1__0"
    // InternalSensidl.g:4588:1: rule__UNIT__Group_1__0 : rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 ;
    public final void rule__UNIT__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4592:1: ( rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 )
            // InternalSensidl.g:4593:2: rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__UNIT__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UNIT__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group_1__0"


    // $ANTLR start "rule__UNIT__Group_1__0__Impl"
    // InternalSensidl.g:4600:1: rule__UNIT__Group_1__0__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__UNIT__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4604:1: ( ( RULE_ANY_OTHER ) )
            // InternalSensidl.g:4605:1: ( RULE_ANY_OTHER )
            {
            // InternalSensidl.g:4605:1: ( RULE_ANY_OTHER )
            // InternalSensidl.g:4606:1: RULE_ANY_OTHER
            {
             before(grammarAccess.getUNITAccess().getANY_OTHERTerminalRuleCall_1_0()); 
            match(input,RULE_ANY_OTHER,FOLLOW_2); 
             after(grammarAccess.getUNITAccess().getANY_OTHERTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group_1__0__Impl"


    // $ANTLR start "rule__UNIT__Group_1__1"
    // InternalSensidl.g:4617:1: rule__UNIT__Group_1__1 : rule__UNIT__Group_1__1__Impl ;
    public final void rule__UNIT__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4621:1: ( rule__UNIT__Group_1__1__Impl )
            // InternalSensidl.g:4622:2: rule__UNIT__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UNIT__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group_1__1"


    // $ANTLR start "rule__UNIT__Group_1__1__Impl"
    // InternalSensidl.g:4628:1: rule__UNIT__Group_1__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4632:1: ( ( ( RULE_ID )* ) )
            // InternalSensidl.g:4633:1: ( ( RULE_ID )* )
            {
            // InternalSensidl.g:4633:1: ( ( RULE_ID )* )
            // InternalSensidl.g:4634:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_1_1()); 
            // InternalSensidl.g:4635:1: ( RULE_ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==EOF||(LA31_2>=RULE_ID && LA31_2<=RULE_DESCRIPTION)||(LA31_2>=30 && LA31_2<=31)||LA31_2==43) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalSensidl.g:4635:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_24); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getUNITAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group_1__1__Impl"


    // $ANTLR start "rule__SensorInterface__NameAssignment_1"
    // InternalSensidl.g:4650:1: rule__SensorInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SensorInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4654:1: ( ( RULE_ID ) )
            // InternalSensidl.g:4655:1: ( RULE_ID )
            {
            // InternalSensidl.g:4655:1: ( RULE_ID )
            // InternalSensidl.g:4656:1: RULE_ID
            {
             before(grammarAccess.getSensorInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__NameAssignment_1"


    // $ANTLR start "rule__SensorInterface__DescriptionAssignment_2"
    // InternalSensidl.g:4665:1: rule__SensorInterface__DescriptionAssignment_2 : ( RULE_DESCRIPTION ) ;
    public final void rule__SensorInterface__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4669:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:4670:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:4670:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:4671:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getSensorInterfaceAccess().getDescriptionDESCRIPTIONTerminalRuleCall_2_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
             after(grammarAccess.getSensorInterfaceAccess().getDescriptionDESCRIPTIONTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__DescriptionAssignment_2"


    // $ANTLR start "rule__SensorInterface__IDAssignment_3_2"
    // InternalSensidl.g:4680:1: rule__SensorInterface__IDAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__SensorInterface__IDAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4684:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:4685:1: ( RULE_STRING )
            {
            // InternalSensidl.g:4685:1: ( RULE_STRING )
            // InternalSensidl.g:4686:1: RULE_STRING
            {
             before(grammarAccess.getSensorInterfaceAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSensorInterfaceAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__IDAssignment_3_2"


    // $ANTLR start "rule__SensorInterface__EncodingSettingsAssignment_5"
    // InternalSensidl.g:4695:1: rule__SensorInterface__EncodingSettingsAssignment_5 : ( ruleEncodingSettings ) ;
    public final void rule__SensorInterface__EncodingSettingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4699:1: ( ( ruleEncodingSettings ) )
            // InternalSensidl.g:4700:1: ( ruleEncodingSettings )
            {
            // InternalSensidl.g:4700:1: ( ruleEncodingSettings )
            // InternalSensidl.g:4701:1: ruleEncodingSettings
            {
             before(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsEncodingSettingsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEncodingSettings();

            state._fsp--;

             after(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsEncodingSettingsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__EncodingSettingsAssignment_5"


    // $ANTLR start "rule__SensorInterface__DataDescriptionAssignment_6"
    // InternalSensidl.g:4710:1: rule__SensorInterface__DataDescriptionAssignment_6 : ( ruleSensorDataDescription ) ;
    public final void rule__SensorInterface__DataDescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4714:1: ( ( ruleSensorDataDescription ) )
            // InternalSensidl.g:4715:1: ( ruleSensorDataDescription )
            {
            // InternalSensidl.g:4715:1: ( ruleSensorDataDescription )
            // InternalSensidl.g:4716:1: ruleSensorDataDescription
            {
             before(grammarAccess.getSensorInterfaceAccess().getDataDescriptionSensorDataDescriptionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorDataDescription();

            state._fsp--;

             after(grammarAccess.getSensorInterfaceAccess().getDataDescriptionSensorDataDescriptionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__DataDescriptionAssignment_6"


    // $ANTLR start "rule__EncodingSettings__CodingAssignment_2"
    // InternalSensidl.g:4725:1: rule__EncodingSettings__CodingAssignment_2 : ( ruleCoding ) ;
    public final void rule__EncodingSettings__CodingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4729:1: ( ( ruleCoding ) )
            // InternalSensidl.g:4730:1: ( ruleCoding )
            {
            // InternalSensidl.g:4730:1: ( ruleCoding )
            // InternalSensidl.g:4731:1: ruleCoding
            {
             before(grammarAccess.getEncodingSettingsAccess().getCodingCodingEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCoding();

            state._fsp--;

             after(grammarAccess.getEncodingSettingsAccess().getCodingCodingEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__CodingAssignment_2"


    // $ANTLR start "rule__EncodingSettings__EndiannessAssignment_6"
    // InternalSensidl.g:4740:1: rule__EncodingSettings__EndiannessAssignment_6 : ( ruleEndianness ) ;
    public final void rule__EncodingSettings__EndiannessAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4744:1: ( ( ruleEndianness ) )
            // InternalSensidl.g:4745:1: ( ruleEndianness )
            {
            // InternalSensidl.g:4745:1: ( ruleEndianness )
            // InternalSensidl.g:4746:1: ruleEndianness
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessEndiannessEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEndianness();

            state._fsp--;

             after(grammarAccess.getEncodingSettingsAccess().getEndiannessEndiannessEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__EndiannessAssignment_6"


    // $ANTLR start "rule__EncodingSettings__AlignmentAssignment_10"
    // InternalSensidl.g:4755:1: rule__EncodingSettings__AlignmentAssignment_10 : ( RULE_INT ) ;
    public final void rule__EncodingSettings__AlignmentAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4759:1: ( ( RULE_INT ) )
            // InternalSensidl.g:4760:1: ( RULE_INT )
            {
            // InternalSensidl.g:4760:1: ( RULE_INT )
            // InternalSensidl.g:4761:1: RULE_INT
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEncodingSettingsAccess().getAlignmentINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__AlignmentAssignment_10"


    // $ANTLR start "rule__EncodingSettings__IDAssignment_12_2"
    // InternalSensidl.g:4770:1: rule__EncodingSettings__IDAssignment_12_2 : ( RULE_STRING ) ;
    public final void rule__EncodingSettings__IDAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4774:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:4775:1: ( RULE_STRING )
            {
            // InternalSensidl.g:4775:1: ( RULE_STRING )
            // InternalSensidl.g:4776:1: RULE_STRING
            {
             before(grammarAccess.getEncodingSettingsAccess().getIDSTRINGTerminalRuleCall_12_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEncodingSettingsAccess().getIDSTRINGTerminalRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__IDAssignment_12_2"


    // $ANTLR start "rule__SensorDataDescription__IDAssignment_2_2"
    // InternalSensidl.g:4785:1: rule__SensorDataDescription__IDAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__SensorDataDescription__IDAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4789:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:4790:1: ( RULE_STRING )
            {
            // InternalSensidl.g:4790:1: ( RULE_STRING )
            // InternalSensidl.g:4791:1: RULE_STRING
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIDSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSensorDataDescriptionAccess().getIDSTRINGTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__IDAssignment_2_2"


    // $ANTLR start "rule__SensorDataDescription__DataSetsAssignment_4"
    // InternalSensidl.g:4800:1: rule__SensorDataDescription__DataSetsAssignment_4 : ( ruleDataSet ) ;
    public final void rule__SensorDataDescription__DataSetsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4804:1: ( ( ruleDataSet ) )
            // InternalSensidl.g:4805:1: ( ruleDataSet )
            {
            // InternalSensidl.g:4805:1: ( ruleDataSet )
            // InternalSensidl.g:4806:1: ruleDataSet
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDataSetsDataSetParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDataSet();

            state._fsp--;

             after(grammarAccess.getSensorDataDescriptionAccess().getDataSetsDataSetParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__DataSetsAssignment_4"


    // $ANTLR start "rule__DataSet__NameAssignment_1"
    // InternalSensidl.g:4815:1: rule__DataSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4819:1: ( ( RULE_ID ) )
            // InternalSensidl.g:4820:1: ( RULE_ID )
            {
            // InternalSensidl.g:4820:1: ( RULE_ID )
            // InternalSensidl.g:4821:1: RULE_ID
            {
             before(grammarAccess.getDataSetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__NameAssignment_1"


    // $ANTLR start "rule__DataSet__ParentDataSetAssignment_2_1"
    // InternalSensidl.g:4830:1: rule__DataSet__ParentDataSetAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSet__ParentDataSetAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4834:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:4835:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:4835:1: ( ( RULE_ID ) )
            // InternalSensidl.g:4836:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_2_1_0()); 
            // InternalSensidl.g:4837:1: ( RULE_ID )
            // InternalSensidl.g:4838:1: RULE_ID
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getParentDataSetDataSetIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__ParentDataSetAssignment_2_1"


    // $ANTLR start "rule__DataSet__ParentDataSetAssignment_3_1"
    // InternalSensidl.g:4849:1: rule__DataSet__ParentDataSetAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSet__ParentDataSetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4853:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:4854:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:4854:1: ( ( RULE_ID ) )
            // InternalSensidl.g:4855:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_3_1_0()); 
            // InternalSensidl.g:4856:1: ( RULE_ID )
            // InternalSensidl.g:4857:1: RULE_ID
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getParentDataSetDataSetIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__ParentDataSetAssignment_3_1"


    // $ANTLR start "rule__DataSet__IDAssignment_4_2"
    // InternalSensidl.g:4868:1: rule__DataSet__IDAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__DataSet__IDAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4872:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:4873:1: ( RULE_STRING )
            {
            // InternalSensidl.g:4873:1: ( RULE_STRING )
            // InternalSensidl.g:4874:1: RULE_STRING
            {
             before(grammarAccess.getDataSetAccess().getIDSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getIDSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__IDAssignment_4_2"


    // $ANTLR start "rule__DataSet__DescriptionAssignment_5"
    // InternalSensidl.g:4883:1: rule__DataSet__DescriptionAssignment_5 : ( RULE_DESCRIPTION ) ;
    public final void rule__DataSet__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4887:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:4888:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:4888:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:4889:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getDataSetAccess().getDescriptionDESCRIPTIONTerminalRuleCall_5_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getDescriptionDESCRIPTIONTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__DescriptionAssignment_5"


    // $ANTLR start "rule__DataSet__DataAssignment_7"
    // InternalSensidl.g:4898:1: rule__DataSet__DataAssignment_7 : ( ruleData ) ;
    public final void rule__DataSet__DataAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4902:1: ( ( ruleData ) )
            // InternalSensidl.g:4903:1: ( ruleData )
            {
            // InternalSensidl.g:4903:1: ( ruleData )
            // InternalSensidl.g:4904:1: ruleData
            {
             before(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__DataAssignment_7"


    // $ANTLR start "rule__MeasurementData__NameAssignment_0"
    // InternalSensidl.g:4913:1: rule__MeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4917:1: ( ( RULE_ID ) )
            // InternalSensidl.g:4918:1: ( RULE_ID )
            {
            // InternalSensidl.g:4918:1: ( RULE_ID )
            // InternalSensidl.g:4919:1: RULE_ID
            {
             before(grammarAccess.getMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__NameAssignment_0"


    // $ANTLR start "rule__MeasurementData__DataTypeAssignment_2"
    // InternalSensidl.g:4928:1: rule__MeasurementData__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__MeasurementData__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4932:1: ( ( ruleDataType ) )
            // InternalSensidl.g:4933:1: ( ruleDataType )
            {
            // InternalSensidl.g:4933:1: ( ruleDataType )
            // InternalSensidl.g:4934:1: ruleDataType
            {
             before(grammarAccess.getMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__DataTypeAssignment_2"


    // $ANTLR start "rule__MeasurementData__UnitAssignment_4"
    // InternalSensidl.g:4943:1: rule__MeasurementData__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementData__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4947:1: ( ( ruleUNIT ) )
            // InternalSensidl.g:4948:1: ( ruleUNIT )
            {
            // InternalSensidl.g:4948:1: ( ruleUNIT )
            // InternalSensidl.g:4949:1: ruleUNIT
            {
             before(grammarAccess.getMeasurementDataAccess().getUnitUNITParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUNIT();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getUnitUNITParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__UnitAssignment_4"


    // $ANTLR start "rule__MeasurementData__IDAssignment_5_2"
    // InternalSensidl.g:4958:1: rule__MeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4962:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:4963:1: ( RULE_STRING )
            {
            // InternalSensidl.g:4963:1: ( RULE_STRING )
            // InternalSensidl.g:4964:1: RULE_STRING
            {
             before(grammarAccess.getMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__IDAssignment_5_2"


    // $ANTLR start "rule__MeasurementData__AdjustmentsAssignment_6_0_1"
    // InternalSensidl.g:4973:1: rule__MeasurementData__AdjustmentsAssignment_6_0_1 : ( ruleDataConversion ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4977:1: ( ( ruleDataConversion ) )
            // InternalSensidl.g:4978:1: ( ruleDataConversion )
            {
            // InternalSensidl.g:4978:1: ( ruleDataConversion )
            // InternalSensidl.g:4979:1: ruleDataConversion
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataConversionParserRuleCall_6_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataConversion();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataConversionParserRuleCall_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__AdjustmentsAssignment_6_0_1"


    // $ANTLR start "rule__MeasurementData__AdjustmentsAssignment_6_1_1"
    // InternalSensidl.g:4988:1: rule__MeasurementData__AdjustmentsAssignment_6_1_1 : ( ruleDataRange ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4992:1: ( ( ruleDataRange ) )
            // InternalSensidl.g:4993:1: ( ruleDataRange )
            {
            // InternalSensidl.g:4993:1: ( ruleDataRange )
            // InternalSensidl.g:4994:1: ruleDataRange
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataRangeParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataRange();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataRangeParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__AdjustmentsAssignment_6_1_1"


    // $ANTLR start "rule__MeasurementData__AdjustmentsAssignment_6_2_1"
    // InternalSensidl.g:5003:1: rule__MeasurementData__AdjustmentsAssignment_6_2_1 : ( ruleDataConversion ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5007:1: ( ( ruleDataConversion ) )
            // InternalSensidl.g:5008:1: ( ruleDataConversion )
            {
            // InternalSensidl.g:5008:1: ( ruleDataConversion )
            // InternalSensidl.g:5009:1: ruleDataConversion
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataConversionParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataConversion();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataConversionParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__AdjustmentsAssignment_6_2_1"


    // $ANTLR start "rule__MeasurementData__AdjustmentsAssignment_6_2_3"
    // InternalSensidl.g:5018:1: rule__MeasurementData__AdjustmentsAssignment_6_2_3 : ( ruleDataRange ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5022:1: ( ( ruleDataRange ) )
            // InternalSensidl.g:5023:1: ( ruleDataRange )
            {
            // InternalSensidl.g:5023:1: ( ruleDataRange )
            // InternalSensidl.g:5024:1: ruleDataRange
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataRangeParserRuleCall_6_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataRange();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataRangeParserRuleCall_6_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__AdjustmentsAssignment_6_2_3"


    // $ANTLR start "rule__MeasurementData__DescriptionAssignment_7"
    // InternalSensidl.g:5033:1: rule__MeasurementData__DescriptionAssignment_7 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementData__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5037:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:5038:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:5038:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:5039:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_7_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__DescriptionAssignment_7"


    // $ANTLR start "rule__NonMeasurementData__NameAssignment_0"
    // InternalSensidl.g:5048:1: rule__NonMeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NonMeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5052:1: ( ( RULE_ID ) )
            // InternalSensidl.g:5053:1: ( RULE_ID )
            {
            // InternalSensidl.g:5053:1: ( RULE_ID )
            // InternalSensidl.g:5054:1: RULE_ID
            {
             before(grammarAccess.getNonMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__NameAssignment_0"


    // $ANTLR start "rule__NonMeasurementData__DataTypeAssignment_2_0"
    // InternalSensidl.g:5063:1: rule__NonMeasurementData__DataTypeAssignment_2_0 : ( ruleDataType ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5067:1: ( ( ruleDataType ) )
            // InternalSensidl.g:5068:1: ( ruleDataType )
            {
            // InternalSensidl.g:5068:1: ( ruleDataType )
            // InternalSensidl.g:5069:1: ruleDataType
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__DataTypeAssignment_2_0"


    // $ANTLR start "rule__NonMeasurementData__DataTypeAssignment_2_1"
    // InternalSensidl.g:5078:1: rule__NonMeasurementData__DataTypeAssignment_2_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5082:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:5083:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:5083:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:5084:1: ruleDataTypeNotAdjustable
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataTypeNotAdjustable();

            state._fsp--;

             after(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__DataTypeAssignment_2_1"


    // $ANTLR start "rule__NonMeasurementData__ConstantAssignment_3"
    // InternalSensidl.g:5093:1: rule__NonMeasurementData__ConstantAssignment_3 : ( ( 'constant' ) ) ;
    public final void rule__NonMeasurementData__ConstantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5097:1: ( ( ( 'constant' ) ) )
            // InternalSensidl.g:5098:1: ( ( 'constant' ) )
            {
            // InternalSensidl.g:5098:1: ( ( 'constant' ) )
            // InternalSensidl.g:5099:1: ( 'constant' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 
            // InternalSensidl.g:5100:1: ( 'constant' )
            // InternalSensidl.g:5101:1: 'constant'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 

            }

             after(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ConstantAssignment_3"


    // $ANTLR start "rule__NonMeasurementData__ValueAssignment_4_2"
    // InternalSensidl.g:5116:1: rule__NonMeasurementData__ValueAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5120:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:5121:1: ( RULE_STRING )
            {
            // InternalSensidl.g:5121:1: ( RULE_STRING )
            // InternalSensidl.g:5122:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ValueAssignment_4_2"


    // $ANTLR start "rule__NonMeasurementData__IDAssignment_5_2"
    // InternalSensidl.g:5131:1: rule__NonMeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5135:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:5136:1: ( RULE_STRING )
            {
            // InternalSensidl.g:5136:1: ( RULE_STRING )
            // InternalSensidl.g:5137:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__IDAssignment_5_2"


    // $ANTLR start "rule__NonMeasurementData__DescriptionAssignment_6"
    // InternalSensidl.g:5146:1: rule__NonMeasurementData__DescriptionAssignment_6 : ( RULE_DESCRIPTION ) ;
    public final void rule__NonMeasurementData__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5150:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:5151:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:5151:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:5152:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_6_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__DescriptionAssignment_6"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__NameAssignment_0"
    // InternalSensidl.g:5161:1: rule__MeasurementDataNotAdjustable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementDataNotAdjustable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5165:1: ( ( RULE_ID ) )
            // InternalSensidl.g:5166:1: ( RULE_ID )
            {
            // InternalSensidl.g:5166:1: ( RULE_ID )
            // InternalSensidl.g:5167:1: RULE_ID
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__NameAssignment_0"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__DataTypeAssignment_2"
    // InternalSensidl.g:5176:1: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__MeasurementDataNotAdjustable__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5180:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:5181:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:5181:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:5182:1: ruleDataTypeNotAdjustable
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataTypeNotAdjustable();

            state._fsp--;

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__DataTypeAssignment_2"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__UnitAssignment_4"
    // InternalSensidl.g:5191:1: rule__MeasurementDataNotAdjustable__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementDataNotAdjustable__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5195:1: ( ( ruleUNIT ) )
            // InternalSensidl.g:5196:1: ( ruleUNIT )
            {
            // InternalSensidl.g:5196:1: ( ruleUNIT )
            // InternalSensidl.g:5197:1: ruleUNIT
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitUNITParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUNIT();

            state._fsp--;

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitUNITParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__UnitAssignment_4"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__IDAssignment_5_2"
    // InternalSensidl.g:5206:1: rule__MeasurementDataNotAdjustable__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementDataNotAdjustable__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5210:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:5211:1: ( RULE_STRING )
            {
            // InternalSensidl.g:5211:1: ( RULE_STRING )
            // InternalSensidl.g:5212:1: RULE_STRING
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__IDAssignment_5_2"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__DescriptionAssignment_6"
    // InternalSensidl.g:5221:1: rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementDataNotAdjustable__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5225:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:5226:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:5226:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:5227:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionDESCRIPTIONTerminalRuleCall_6_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionDESCRIPTIONTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__DescriptionAssignment_6"


    // $ANTLR start "rule__DataRange__RangeAssignment_1"
    // InternalSensidl.g:5236:1: rule__DataRange__RangeAssignment_1 : ( ruleInterval ) ;
    public final void rule__DataRange__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5240:1: ( ( ruleInterval ) )
            // InternalSensidl.g:5241:1: ( ruleInterval )
            {
            // InternalSensidl.g:5241:1: ( ruleInterval )
            // InternalSensidl.g:5242:1: ruleInterval
            {
             before(grammarAccess.getDataRangeAccess().getRangeIntervalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getDataRangeAccess().getRangeIntervalParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__RangeAssignment_1"


    // $ANTLR start "rule__Interval__LowerBoundAssignment_1"
    // InternalSensidl.g:5251:1: rule__Interval__LowerBoundAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Interval__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5255:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:5256:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:5256:1: ( ruleDOUBLE )
            // InternalSensidl.g:5257:1: ruleDOUBLE
            {
             before(grammarAccess.getIntervalAccess().getLowerBoundDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getLowerBoundDOUBLEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__LowerBoundAssignment_1"


    // $ANTLR start "rule__Interval__UpperBoundAssignment_3"
    // InternalSensidl.g:5266:1: rule__Interval__UpperBoundAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Interval__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5270:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:5271:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:5271:1: ( ruleDOUBLE )
            // InternalSensidl.g:5272:1: ruleDOUBLE
            {
             before(grammarAccess.getIntervalAccess().getUpperBoundDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getUpperBoundDOUBLEParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__UpperBoundAssignment_3"


    // $ANTLR start "rule__LinearDataConversion__ScalingFactorAssignment_2"
    // InternalSensidl.g:5281:1: rule__LinearDataConversion__ScalingFactorAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__ScalingFactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5285:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:5286:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:5286:1: ( ruleDOUBLE )
            // InternalSensidl.g:5287:1: ruleDOUBLE
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionAccess().getScalingFactorDOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__ScalingFactorAssignment_2"


    // $ANTLR start "rule__LinearDataConversion__OffsetAssignment_5"
    // InternalSensidl.g:5296:1: rule__LinearDataConversion__OffsetAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__OffsetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5300:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:5301:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:5301:1: ( ruleDOUBLE )
            // InternalSensidl.g:5302:1: ruleDOUBLE
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetDOUBLEParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionAccess().getOffsetDOUBLEParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__OffsetAssignment_5"


    // $ANTLR start "rule__LinearDataConversionWithInterval__FromIntervalAssignment_1"
    // InternalSensidl.g:5311:1: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__FromIntervalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5315:1: ( ( ruleInterval ) )
            // InternalSensidl.g:5316:1: ( ruleInterval )
            {
            // InternalSensidl.g:5316:1: ( ruleInterval )
            // InternalSensidl.g:5317:1: ruleInterval
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalIntervalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalIntervalParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__FromIntervalAssignment_1"


    // $ANTLR start "rule__LinearDataConversionWithInterval__ToIntervalAssignment_3"
    // InternalSensidl.g:5326:1: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__ToIntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5330:1: ( ( ruleInterval ) )
            // InternalSensidl.g:5331:1: ( ruleInterval )
            {
            // InternalSensidl.g:5331:1: ( ruleInterval )
            // InternalSensidl.g:5332:1: ruleInterval
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalIntervalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalIntervalParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__ToIntervalAssignment_3"


    // $ANTLR start "rule__LinearDataConversionWithInterval__DataTypeAssignment_5"
    // InternalSensidl.g:5341:1: rule__LinearDataConversionWithInterval__DataTypeAssignment_5 : ( ruleDataType ) ;
    public final void rule__LinearDataConversionWithInterval__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5345:1: ( ( ruleDataType ) )
            // InternalSensidl.g:5346:1: ( ruleDataType )
            {
            // InternalSensidl.g:5346:1: ( ruleDataType )
            // InternalSensidl.g:5347:1: ruleDataType
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeDataTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeDataTypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__DataTypeAssignment_5"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\3\uffff\14\20\3\uffff";
    static final String dfa_3s = "\1\5\1\51\1\20\14\5\3\uffff";
    static final String dfa_4s = "\1\5\1\51\1\33\14\67\3\uffff";
    static final String dfa_5s = "\17\uffff\1\3\1\2\1\1";
    static final String dfa_6s = "\22\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\17\1\uffff\1\20\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\17\1\uffff\1\20\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\21\1\uffff\1\20\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\21\1\uffff\1\20\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\21\1\uffff\1\20\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\21\1\uffff\1\20\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\21\1\uffff\1\20\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\21\1\uffff\1\20\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\21\1\uffff\1\20\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\21\1\uffff\1\20\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\21\1\uffff\1\20\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\21\1\uffff\1\20\12\uffff\1\20",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "556:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) );";
        }
    }
    static final String dfa_8s = "\56\uffff";
    static final String dfa_9s = "\21\uffff\1\25\7\uffff\1\25\12\uffff\12\25";
    static final String dfa_10s = "\1\53\1\56\1\40\1\57\1\uffff\2\4\1\63\1\60\1\4\1\40\2\4\1\63\1\4\1\60\1\61\1\5\1\4\1\65\1\4\2\uffff\1\61\1\57\1\5\1\4\1\60\2\4\1\60\1\61\1\4\1\51\1\61\1\22\12\5";
    static final String dfa_11s = "\1\53\1\64\1\40\1\57\1\uffff\2\4\2\66\1\4\1\40\2\4\1\63\1\4\1\60\2\66\1\4\1\65\1\4\2\uffff\1\61\1\57\1\42\1\4\1\66\2\4\1\60\1\66\1\4\1\51\1\61\1\33\12\42";
    static final String dfa_12s = "\4\uffff\1\2\20\uffff\1\1\1\3\27\uffff";
    static final String dfa_13s = "\56\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\4\3\uffff\1\2\1\uffff\1\3",
            "\1\5",
            "\1\6",
            "",
            "\1\7",
            "\1\10",
            "\1\12\2\uffff\1\11",
            "\1\14\5\uffff\1\13",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\12",
            "\1\21",
            "\1\14",
            "\1\23\4\uffff\1\22",
            "\1\25\1\uffff\1\25\26\uffff\1\25\3\uffff\1\26\23\uffff\1\24",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "",
            "\1\23",
            "\1\32",
            "\1\25\1\uffff\1\25\26\uffff\1\25\3\uffff\1\26",
            "\1\33",
            "\1\35\5\uffff\1\34",
            "\1\36",
            "\1\37",
            "\1\35",
            "\1\41\4\uffff\1\40",
            "\1\42",
            "\1\43",
            "\1\41",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55",
            "\1\25\1\uffff\1\25\26\uffff\1\25\3\uffff\1\26",
            "\1\25\1\uffff\1\25\26\uffff\1\25\3\uffff\1\26",
            "\1\25\1\uffff\1\25\26\uffff\1\25\3\uffff\1\26",
            "\1\25\1\uffff\1\25\26\uffff\1\25\3\uffff\1\26",
            "\1\25\1\uffff\1\25\26\uffff\1\25\3\uffff\1\26",
            "\1\25\1\uffff\1\25\26\uffff\1\25\3\uffff\1\26",
            "\1\25\1\uffff\1\25\26\uffff\1\25\3\uffff\1\26",
            "\1\25\1\uffff\1\25\26\uffff\1\25\3\uffff\1\26",
            "\1\25\1\uffff\1\25\26\uffff\1\25\3\uffff\1\26",
            "\1\25\1\uffff\1\25\26\uffff\1\25\3\uffff\1\26"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "584:1: rule__MeasurementData__Alternatives_6 : ( ( ( rule__MeasurementData__Group_6_0__0 ) ) | ( ( rule__MeasurementData__Group_6_1__0 ) ) | ( ( rule__MeasurementData__Group_6_2__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000A0000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000104A0000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000FFC0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080080000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000000FFF0000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080100080000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000042L});

}
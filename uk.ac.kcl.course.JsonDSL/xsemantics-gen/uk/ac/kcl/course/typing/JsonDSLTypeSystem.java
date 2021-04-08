package uk.ac.kcl.course.typing;

import com.google.inject.Provider;
import org.eclipse.xsemantics.runtime.ErrorInformation;
import org.eclipse.xsemantics.runtime.Result;
import org.eclipse.xsemantics.runtime.RuleApplicationTrace;
import org.eclipse.xsemantics.runtime.RuleEnvironment;
import org.eclipse.xsemantics.runtime.RuleFailedException;
import org.eclipse.xsemantics.runtime.XsemanticsRuntimeSystem;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import uk.ac.kcl.course.jsonQ.AdditionalQuery;
import uk.ac.kcl.course.jsonQ.AggregateStatements;
import uk.ac.kcl.course.jsonQ.GetStatements;
import uk.ac.kcl.course.jsonQ.InputVal;
import uk.ac.kcl.course.jsonQ.Statements;
import uk.ac.kcl.course.jsonQ.StringLiteral;

@SuppressWarnings("all")
public class JsonDSLTypeSystem extends XsemanticsRuntimeSystem {
  public static final String TGETSTATEMENTINPUTTYPE = "uk.ac.kcl.course.typing.TGetStatementInputType";
  
  public static final String TAGGSTATEMENTINPUTTYPE = "uk.ac.kcl.course.typing.TAggStatementInputType";
  
  public static final String TADDQUERYINPUTTYPE = "uk.ac.kcl.course.typing.TAddQueryInputType";
  
  public static final String SUBTYPING = "uk.ac.kcl.course.typing.SubTyping";
  
  private PolymorphicDispatcher<Result<JsonQInputtype>> typeDispatcher;
  
  private PolymorphicDispatcher<Result<JsonQInputtype>> typeAddDispatcher;
  
  private PolymorphicDispatcher<Result<Boolean>> subtypeDispatcher;
  
  public JsonDSLTypeSystem() {
    init();
  }
  
  public void init() {
    typeDispatcher = buildPolymorphicDispatcher1(
    	"typeImpl", 3, "|-", ":");
    typeAddDispatcher = buildPolymorphicDispatcher1(
    	"typeAddImpl", 3, "|-", "~>");
    subtypeDispatcher = buildPolymorphicDispatcher1(
    	"subtypeImpl", 4, "|-", "<:");
  }
  
  public Result<JsonQInputtype> type(final Statements inp) {
    return type(new RuleEnvironment(), null, inp);
  }
  
  public Result<JsonQInputtype> type(final RuleEnvironment _environment_, final Statements inp) {
    return type(_environment_, null, inp);
  }
  
  public Result<JsonQInputtype> type(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Statements inp) {
    try {
    	return typeInternal(_environment_, _trace_, inp);
    } catch (Exception _e_type) {
    	return resultForFailure(_e_type);
    }
  }
  
  public Result<JsonQInputtype> typeAdd(final AdditionalQuery inp) {
    return typeAdd(new RuleEnvironment(), null, inp);
  }
  
  public Result<JsonQInputtype> typeAdd(final RuleEnvironment _environment_, final AdditionalQuery inp) {
    return typeAdd(_environment_, null, inp);
  }
  
  public Result<JsonQInputtype> typeAdd(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final AdditionalQuery inp) {
    try {
    	return typeAddInternal(_environment_, _trace_, inp);
    } catch (Exception _e_typeAdd) {
    	return resultForFailure(_e_typeAdd);
    }
  }
  
  public Result<Boolean> subtype(final JsonQInputtype left, final JsonQInputtype right) {
    return subtype(new RuleEnvironment(), null, left, right);
  }
  
  public Result<Boolean> subtype(final RuleEnvironment _environment_, final JsonQInputtype left, final JsonQInputtype right) {
    return subtype(_environment_, null, left, right);
  }
  
  public Result<Boolean> subtype(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final JsonQInputtype left, final JsonQInputtype right) {
    try {
    	return subtypeInternal(_environment_, _trace_, left, right);
    } catch (Exception _e_subtype) {
    	return resultForFailure(_e_subtype);
    }
  }
  
  public Boolean subtypeSucceeded(final JsonQInputtype left, final JsonQInputtype right) {
    return subtypeSucceeded(new RuleEnvironment(), null, left, right);
  }
  
  public Boolean subtypeSucceeded(final RuleEnvironment _environment_, final JsonQInputtype left, final JsonQInputtype right) {
    return subtypeSucceeded(_environment_, null, left, right);
  }
  
  public Boolean subtypeSucceeded(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final JsonQInputtype left, final JsonQInputtype right) {
    try {
    	subtypeInternal(_environment_, _trace_, left, right);
    	return true;
    } catch (Exception _e_subtype) {
    	return false;
    }
  }
  
  public Result<Boolean> checkGetStatementInput(final GetStatements stmt) {
    return checkGetStatementInput(null, stmt);
  }
  
  public Result<Boolean> checkGetStatementInput(final RuleApplicationTrace _trace_, final GetStatements stmt) {
    try {
    	return checkGetStatementInputInternal(_trace_, stmt);
    } catch (Exception _e_checkGetStatementInput) {
    	return resultForFailure(_e_checkGetStatementInput);
    }
  }
  
  protected Result<Boolean> checkGetStatementInputInternal(final RuleApplicationTrace _trace_, final GetStatements stmt) throws RuleFailedException {
    /* empty |- stmt : var JsonQInputtype type */
    JsonQInputtype type = null;
    Result<JsonQInputtype> result = typeInternal(emptyEnvironment(), _trace_, stmt);
    checkAssignableTo(result.getFirst(), JsonQInputtype.class);
    type = (JsonQInputtype) result.getFirst();
    
    /* empty |- type <: JsonQInputtype.STRING */
    subtypeInternal(emptyEnvironment(), _trace_, type, JsonQInputtype.STRING);
    return new Result<Boolean>(true);
  }
  
  public Result<Boolean> checkAggStatementInput(final AggregateStatements stmt) {
    return checkAggStatementInput(null, stmt);
  }
  
  public Result<Boolean> checkAggStatementInput(final RuleApplicationTrace _trace_, final AggregateStatements stmt) {
    try {
    	return checkAggStatementInputInternal(_trace_, stmt);
    } catch (Exception _e_checkAggStatementInput) {
    	return resultForFailure(_e_checkAggStatementInput);
    }
  }
  
  protected Result<Boolean> checkAggStatementInputInternal(final RuleApplicationTrace _trace_, final AggregateStatements stmt) throws RuleFailedException {
    /* empty |- stmt : var JsonQInputtype type */
    JsonQInputtype type = null;
    Result<JsonQInputtype> result = typeInternal(emptyEnvironment(), _trace_, stmt);
    checkAssignableTo(result.getFirst(), JsonQInputtype.class);
    type = (JsonQInputtype) result.getFirst();
    
    /* empty |- type <: JsonQInputtype.STRING */
    subtypeInternal(emptyEnvironment(), _trace_, type, JsonQInputtype.STRING);
    return new Result<Boolean>(true);
  }
  
  public Result<Boolean> checkAddtionalQueryStatementInput(final AdditionalQuery stmt) {
    return checkAddtionalQueryStatementInput(null, stmt);
  }
  
  public Result<Boolean> checkAddtionalQueryStatementInput(final RuleApplicationTrace _trace_, final AdditionalQuery stmt) {
    try {
    	return checkAddtionalQueryStatementInputInternal(_trace_, stmt);
    } catch (Exception _e_checkAddtionalQueryStatementInput) {
    	return resultForFailure(_e_checkAddtionalQueryStatementInput);
    }
  }
  
  protected Result<Boolean> checkAddtionalQueryStatementInputInternal(final RuleApplicationTrace _trace_, final AdditionalQuery stmt) throws RuleFailedException {
    /* empty |- stmt ~> var JsonQInputtype type */
    JsonQInputtype type = null;
    Result<JsonQInputtype> result = typeAddInternal(emptyEnvironment(), _trace_, stmt);
    checkAssignableTo(result.getFirst(), JsonQInputtype.class);
    type = (JsonQInputtype) result.getFirst();
    
    /* empty |- type <: JsonQInputtype.STRING */
    subtypeInternal(emptyEnvironment(), _trace_, type, JsonQInputtype.STRING);
    return new Result<Boolean>(true);
  }
  
  protected Result<JsonQInputtype> typeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Statements inp) {
    try {
    	checkParamsNotNull(inp);
    	return typeDispatcher.invoke(_environment_, _trace_, inp);
    } catch (Exception _e_type) {
    	sneakyThrowRuleFailedException(_e_type);
    	return null;
    }
  }
  
  protected void typeThrowException(final String _error, final String _issue, final Exception _ex, final Statements inp, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(inp);
    String _plus = ("Cannot type other than String" + _stringRep);
    String error = _plus;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected Result<JsonQInputtype> typeAddInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final AdditionalQuery inp) {
    try {
    	checkParamsNotNull(inp);
    	return typeAddDispatcher.invoke(_environment_, _trace_, inp);
    } catch (Exception _e_typeAdd) {
    	sneakyThrowRuleFailedException(_e_typeAdd);
    	return null;
    }
  }
  
  protected void typeAddThrowException(final String _error, final String _issue, final Exception _ex, final AdditionalQuery inp, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String error = "Issue in Additional Query Input Value";
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected Result<Boolean> subtypeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final JsonQInputtype left, final JsonQInputtype right) {
    try {
    	checkParamsNotNull(left, right);
    	return subtypeDispatcher.invoke(_environment_, _trace_, left, right);
    } catch (Exception _e_subtype) {
    	sneakyThrowRuleFailedException(_e_subtype);
    	return null;
    }
  }
  
  protected void subtypeThrowException(final String _error, final String _issue, final Exception _ex, final JsonQInputtype left, final JsonQInputtype right, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String error = "The type must be String";
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected Result<JsonQInputtype> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final GetStatements stmt) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<JsonQInputtype> _result_ = applyRuleTGetStatementInputType(G, _subtrace_, stmt);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TGetStatementInputType") + stringRepForEnv(G) + " |- " + stringRep(stmt) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTGetStatementInputType) {
    	typeThrowException(ruleName("TGetStatementInputType") + stringRepForEnv(G) + " |- " + stringRep(stmt) + " : " + "JsonQInputtype",
    		TGETSTATEMENTINPUTTYPE,
    		e_applyRuleTGetStatementInputType, stmt, new ErrorInformation[] {new ErrorInformation(stmt)});
    	return null;
    }
  }
  
  protected Result<JsonQInputtype> applyRuleTGetStatementInputType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final GetStatements stmt) throws RuleFailedException {
    JsonQInputtype type = null; // output parameter
    InputVal _q1val = stmt.getQ1val();
    if ((_q1val instanceof StringLiteral)) {
      type = JsonQInputtype.STRING;
    } else {
      type = JsonQInputtype.INT;
    }
    return new Result<JsonQInputtype>(type);
  }
  
  protected Result<JsonQInputtype> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final AggregateStatements stmt) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<JsonQInputtype> _result_ = applyRuleTAggStatementInputType(G, _subtrace_, stmt);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TAggStatementInputType") + stringRepForEnv(G) + " |- " + stringRep(stmt) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTAggStatementInputType) {
    	typeThrowException(ruleName("TAggStatementInputType") + stringRepForEnv(G) + " |- " + stringRep(stmt) + " : " + "JsonQInputtype",
    		TAGGSTATEMENTINPUTTYPE,
    		e_applyRuleTAggStatementInputType, stmt, new ErrorInformation[] {new ErrorInformation(stmt)});
    	return null;
    }
  }
  
  protected Result<JsonQInputtype> applyRuleTAggStatementInputType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final AggregateStatements stmt) throws RuleFailedException {
    JsonQInputtype type = null; // output parameter
    InputVal _q1val = stmt.getQ1val();
    if ((_q1val instanceof StringLiteral)) {
      type = JsonQInputtype.STRING;
    } else {
      type = JsonQInputtype.INT;
    }
    return new Result<JsonQInputtype>(type);
  }
  
  protected Result<JsonQInputtype> typeAddImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final AdditionalQuery stmt) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<JsonQInputtype> _result_ = applyRuleTAddQueryInputType(G, _subtrace_, stmt);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TAddQueryInputType") + stringRepForEnv(G) + " |- " + stringRep(stmt) + " ~> " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTAddQueryInputType) {
    	typeAddThrowException(ruleName("TAddQueryInputType") + stringRepForEnv(G) + " |- " + stringRep(stmt) + " ~> " + "JsonQInputtype",
    		TADDQUERYINPUTTYPE,
    		e_applyRuleTAddQueryInputType, stmt, new ErrorInformation[] {new ErrorInformation(stmt)});
    	return null;
    }
  }
  
  protected Result<JsonQInputtype> applyRuleTAddQueryInputType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final AdditionalQuery stmt) throws RuleFailedException {
    JsonQInputtype type = null; // output parameter
    InputVal _q2val = stmt.getQ2val();
    if ((_q2val instanceof StringLiteral)) {
      type = JsonQInputtype.STRING;
    } else {
      type = JsonQInputtype.INT;
    }
    return new Result<JsonQInputtype>(type);
  }
  
  protected Result<Boolean> subtypeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final JsonQInputtype left, final JsonQInputtype right) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<Boolean> _result_ = applyRuleSubTyping(G, _subtrace_, left, right);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("SubTyping") + stringRepForEnv(G) + " |- " + stringRep(left) + " <: " + stringRep(right);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleSubTyping) {
    	subtypeThrowException(ruleName("SubTyping") + stringRepForEnv(G) + " |- " + stringRep(left) + " <: " + stringRep(right),
    		SUBTYPING,
    		e_applyRuleSubTyping, left, right, new ErrorInformation[] {});
    	return null;
    }
  }
  
  protected Result<Boolean> applyRuleSubTyping(final RuleEnvironment G, final RuleApplicationTrace _trace_, final JsonQInputtype left, final JsonQInputtype right) throws RuleFailedException {
    int _ordinal = left.ordinal();
    int _ordinal_1 = right.ordinal();
    /* left.ordinal === right.ordinal */
    if (!(_ordinal == _ordinal_1)) {
      sneakyThrowRuleFailedException("left.ordinal === right.ordinal");
    }
    return new Result<Boolean>(true);
  }
}

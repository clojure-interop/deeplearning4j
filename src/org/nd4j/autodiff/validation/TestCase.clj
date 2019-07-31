(ns org.nd4j.autodiff.validation.TestCase
  "TestCase: Validate a SameDiff instance.
 Can be used to validate gradients (enabled by default) and expected outputs (forward pass for variables) if such
 outputs are provided.

 Used with OpValidation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.validation TestCase]))

(defn ->test-case
  "Constructor.

  same-diff - SameDiff instance to test. Note: All of the required inputs should already be set - `org.nd4j.autodiff.samediff.SameDiff`"
  (^TestCase [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new TestCase same-diff)))

(def *-gc-default-print
  "Static Constant.

  type: boolean"
  TestCase/GC_DEFAULT_PRINT)

(def *-gc-default-exit-first-failure
  "Static Constant.

  type: boolean"
  TestCase/GC_DEFAULT_EXIT_FIRST_FAILURE)

(def *-gc-default-debug-mode
  "Static Constant.

  type: boolean"
  TestCase/GC_DEFAULT_DEBUG_MODE)

(def *-gc-default-eps
  "Static Constant.

  type: double"
  TestCase/GC_DEFAULT_EPS)

(def *-gc-default-max-rel-error
  "Static Constant.

  type: double"
  TestCase/GC_DEFAULT_MAX_REL_ERROR)

(def *-gc-default-min-abs-error
  "Static Constant.

  type: double"
  TestCase/GC_DEFAULT_MIN_ABS_ERROR)

(defn expected-output
  "Validate the output (forward pass) for a single variable using INDArray.equals(INDArray)

  name - Name of the variable to check - `java.lang.String`
  expected - Expected INDArray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.autodiff.validation.TestCase`"
  (^org.nd4j.autodiff.validation.TestCase [^TestCase this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray expected]
    (-> this (.expectedOutput name expected))))

(defn expected-output-rel-error
  "Validate the output (forward pass) for a single variable using element-wise relative error:
  relError = abs(x-y)/(abs(x)+abs(y)), with x=y=0 case defined to be 0.0.
  Also has a minimum absolute error condition, which must be satisfied for the relative error failure to be considered
  legitimate

  name - Name of the variable to check - `java.lang.String`
  expected - Expected INDArray - `org.nd4j.linalg.api.ndarray.INDArray`
  max-rel-error - Maximum allowable relative error - `double`
  min-abs-error - Minimum absolute error for a failure to be considered legitimate - `double`

  returns: `org.nd4j.autodiff.validation.TestCase`"
  (^org.nd4j.autodiff.validation.TestCase [^TestCase this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray expected ^Double max-rel-error ^Double min-abs-error]
    (-> this (.expectedOutputRelError name expected max-rel-error min-abs-error))))

(defn expected
  "Validate the output (forward pass) for a single variable using INDArray.equals(INDArray)

  var - Variable to check - `org.nd4j.autodiff.samediff.SDVariable`
  output - Expected INDArray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.autodiff.validation.TestCase`"
  (^org.nd4j.autodiff.validation.TestCase [^TestCase this ^org.nd4j.autodiff.samediff.SDVariable var ^org.nd4j.linalg.api.ndarray.INDArray output]
    (-> this (.expected var output))))

(defn grad-check-skip-variables
  "Specify the input variables that should NOT be gradient checked.
  For example, if an input is an integer index (not real valued) it should be skipped as such an input cannot
  be gradient checked

  to-skip - Name of the input variables to skip gradient check for - `java.lang.String`

  returns: `org.nd4j.autodiff.validation.TestCase`"
  (^org.nd4j.autodiff.validation.TestCase [^TestCase this ^java.lang.String to-skip]
    (-> this (.gradCheckSkipVariables to-skip)))
  (^java.util.Set [^TestCase this]
    (-> this (.gradCheckSkipVariables))))

(defn assert-config-valid
  ""
  ([^TestCase this]
    (-> this (.assertConfigValid))))

(defn test-name-err-msg
  "returns: `java.lang.String`"
  (^java.lang.String [^TestCase this]
    (-> this (.testNameErrMsg))))


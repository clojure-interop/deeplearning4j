(ns org.nd4j.autodiff.validation.OpTestCase
  "Validate the output - and shape function - of a single operation.

 Used with OpValidation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.validation OpTestCase]))

(defn ->op-test-case
  "Constructor.

  op - `org.nd4j.linalg.api.ops.DynamicCustomOp`"
  (^OpTestCase [^org.nd4j.linalg.api.ops.DynamicCustomOp op]
    (new OpTestCase op)))

(defn expected-output
  "Validate the op output using INDArray.equals(INDArray)

  output-num - Number of the output - `int`
  expected - Expected INDArray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.autodiff.validation.OpTestCase`"
  (^org.nd4j.autodiff.validation.OpTestCase [^OpTestCase this ^Integer output-num ^org.nd4j.linalg.api.ndarray.INDArray expected]
    (-> this (.expectedOutput output-num expected)))
  (^org.nd4j.autodiff.validation.OpTestCase [^OpTestCase this ^Integer output-num exp-shape ^org.nd4j.linalg.function.Function validation-fn]
    (-> this (.expectedOutput output-num exp-shape validation-fn))))

(defn expected-output-rel-error
  "Validate the output for a single variable using element-wise relative error:
  relError = abs(x-y)/(abs(x)+abs(y)), with x=y=0 case defined to be 0.0.
  Also has a minimum absolute error condition, which must be satisfied for the relative error failure to be considered
  legitimate

  output-num - output number - `int`
  expected - Expected INDArray - `org.nd4j.linalg.api.ndarray.INDArray`
  max-rel-error - Maximum allowable relative error - `double`
  min-abs-error - Minimum absolute error for a failure to be considered legitimate - `double`

  returns: `org.nd4j.autodiff.validation.OpTestCase`"
  (^org.nd4j.autodiff.validation.OpTestCase [^OpTestCase this ^Integer output-num ^org.nd4j.linalg.api.ndarray.INDArray expected ^Double max-rel-error ^Double min-abs-error]
    (-> this (.expectedOutputRelError output-num expected max-rel-error min-abs-error))))


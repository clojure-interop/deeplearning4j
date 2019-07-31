(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.Choose
  "This op allows us to (based on the passed in condition)
 to return the element fulfilling the condition.
 In numpy, this is equivalent to the boolean indexing like:
 a[a > 2] which returns all elements in the array greater than 2
 as a flat vector.
 This op interops with underlying libnd4j by leveraging the Condition.condtionNum()"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison Choose]))

(defn ->choose
  "Constructor.

  Note that iArgs (integer arguments) and tArgs(double/float arguments)
  may end up being used under the following conditions:
  scalar operations (if a scalar is specified the you do not need to specify an ndarray)
  otherwise, if an ndarray is needed as a second input then put it in the inputs
  Usually, you only need 1 input (the equivalent of the array you're trying to do indexing on)

  inputs - the inputs in to the op - `org.nd4j.linalg.api.ndarray.INDArray[]`
  i-args - the integer arguments as needed - `java.util.List`
  t-args - the arguments - `java.util.List`
  condition - the condition to filter on - `org.nd4j.linalg.indexing.conditions.Condition`"
  (^Choose [inputs ^java.util.List i-args ^java.util.List t-args ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (new Choose inputs i-args t-args condition))
  (^Choose [^java.lang.String op-name inputs outputs ^java.util.List t-arguments ^java.util.List i-arguments]
    (new Choose op-name inputs outputs t-arguments i-arguments))
  (^Choose [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (new Choose same-diff args condition))
  (^Choose [inputs ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (new Choose inputs condition))
  (^Choose []
    (new Choose )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Choose this]
    (-> this (.opName))))


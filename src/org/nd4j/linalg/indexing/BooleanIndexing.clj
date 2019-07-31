(ns org.nd4j.linalg.indexing.BooleanIndexing
  "Boolean indexing"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing BooleanIndexing]))

(defn ->boolean-indexing
  "Constructor."
  (^BooleanIndexing []
    (new BooleanIndexing )))

(defn *apply-mask
  "A minor shortcut for applying a bitmask to
  a matrix

  arr - The array to apply the mask to - `org.nd4j.linalg.api.ndarray.INDArray`
  mask - the mask to apply - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the array with the mask applied - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.api.ndarray.INDArray mask]
    (BooleanIndexing/applyMask arr mask)))

(defn *first-index
  "This method returns first index matching given condition along given dimensions
  PLEASE NOTE: This method will return -1 values for missing conditions

  array - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.linalg.indexing.conditions.Condition condition ^Integer dimension]
    (BooleanIndexing/firstIndex array condition dimension))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (BooleanIndexing/firstIndex array condition)))

(defn *choose-from
  "Choose from the inputs based on the given condition.
  This returns a row vector of all elements fulfilling the
  condition listed within the array for input.
  The double and integer arguments are only relevant
  for scalar operations (like when you have a scalar
  you are trying to compare each element in your input against)

  input - the input to filter - `org.nd4j.linalg.api.ndarray.INDArray[]`
  t-args - the double args - `java.util.List`
  i-args - the integer args - `java.util.List`
  condition - the condition to filter based on - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: a row vector of the input elements that are true
  ffor the given conditions - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [input ^java.util.List t-args ^java.util.List i-args ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (BooleanIndexing/chooseFrom input t-args i-args condition))
  (^org.nd4j.linalg.api.ndarray.INDArray [input ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (BooleanIndexing/chooseFrom input condition)))

(defn *last-index
  "This method returns first index matching given condition along given dimensions
  PLEASE NOTE: This method will return -1 values for missing conditions

  array - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.linalg.indexing.conditions.Condition condition ^Integer dimension]
    (BooleanIndexing/lastIndex array condition dimension))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (BooleanIndexing/lastIndex array condition)))

(defn *assign-if
  "This method does element-wise comparison
  for 2 equal-sized matrices, for each element that matches Condition.
  To is the array to apply the indexing to
  from is a condition mask array (0 or 1).
  This would come from the output of a bit masking method like:
  INDArray.gt(Number),INDArray.gte(Number),
  INDArray.lt(Number),..

  to - the array to apply the condition to - `org.nd4j.linalg.api.ndarray.INDArray`
  from - the mask array - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - the condition to apply - `org.nd4j.linalg.indexing.conditions.Condition`"
  ([^org.nd4j.linalg.api.ndarray.INDArray to ^org.nd4j.linalg.api.ndarray.INDArray from ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (BooleanIndexing/assignIf to from condition)))

(defn *apply-mask-in-place
  "A minor shortcut for applying a bitmask to
  a matrix

  arr - The array to apply the mask to - `org.nd4j.linalg.api.ndarray.INDArray`
  mask - the mask to apply - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the array with the mask applied - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.api.ndarray.INDArray mask]
    (BooleanIndexing/applyMaskInPlace arr mask)))

(defn *or
  "Or over the whole ndarray given some condition, with respect to dimensions

  n - the ndarray to test - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - the condition to test against - `org.nd4j.linalg.indexing.conditions.Condition`
  dimension - `int`

  returns: true if all of the elements meet the specified
  condition false otherwise - `boolean[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray n ^org.nd4j.linalg.indexing.conditions.Condition condition ^Integer dimension]
    (BooleanIndexing/or n condition dimension))
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray n ^org.nd4j.linalg.indexing.conditions.Condition cond]
    (BooleanIndexing/or n cond)))

(defn *replace-where
  "This method does element-wise comparison for 2 equal-sized matrices, for each element that matches Condition

  to - `org.nd4j.linalg.api.ndarray.INDArray`
  from - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`"
  ([^org.nd4j.linalg.api.ndarray.INDArray to ^org.nd4j.linalg.api.ndarray.INDArray from ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (BooleanIndexing/replaceWhere to from condition)))

(defn *and
  "And over the whole ndarray given some condition, with respect to dimensions

  n - the ndarray to test - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - the condition to test against - `org.nd4j.linalg.indexing.conditions.Condition`
  dimension - `int`

  returns: true if all of the elements meet the specified
  condition false otherwise - `boolean[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray n ^org.nd4j.linalg.indexing.conditions.Condition condition ^Integer dimension]
    (BooleanIndexing/and n condition dimension))
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray n ^org.nd4j.linalg.indexing.conditions.Condition cond]
    (BooleanIndexing/and n cond)))

(defn *apply-where
  "Based on the matching elements
  op to based on condition to with function function

  to - the ndarray to op - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - the condition on op - `org.nd4j.linalg.indexing.conditions.Condition`
  function - the function to apply the op to - `com.google.common.base.Function`
  alternative-function - `com.google.common.base.Function`"
  ([^org.nd4j.linalg.api.ndarray.INDArray to ^org.nd4j.linalg.indexing.conditions.Condition condition ^com.google.common.base.Function function ^com.google.common.base.Function alternative-function]
    (BooleanIndexing/applyWhere to condition function alternative-function))
  ([^org.nd4j.linalg.api.ndarray.INDArray to ^org.nd4j.linalg.indexing.conditions.Condition condition ^com.google.common.base.Function function]
    (BooleanIndexing/applyWhere to condition function)))


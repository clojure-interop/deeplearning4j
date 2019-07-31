(ns org.nd4j.linalg.api.ops.IndexAccumulation
  "An index accumulation is an operation that returns an index within
 a NDArray.
 Examples of IndexAccumulation operations include finding the index
 of the minimim value, index of the maximum value, index of the first
 element equal to value y, index of the maximum pair-wise difference
 between two NDArrays X and Y etc.
 Index accumulation is similar to Accumulation in that both are
 accumulation/reduction operations, however index accumulation returns
 an integer corresponding to an index, rather than a real (or complex)
 value.
 Index accumulation operations generally have 3 inputs:
 x -> the origin ndarray
 y -> the pairwise ndarray (frequently null/not applicable)
 n -> the number of times to accumulate
 Note that IndexAccumulation op implementations should be stateless
 (other than the final result and x/y/n arguments) and hence threadsafe,
 such that they may be parallelized using the update, combineSubResults
 and set/getFinalResults methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops IndexAccumulation]))

(defn set-final-result
  "Set the final index/result of the accumulation.

  idx - `int`"
  ([^IndexAccumulation this ^Integer idx]
    (-> this (.setFinalResult idx))))

(defn get-final-result
  "Get the final result of the IndexAccumulation

  returns: `int`"
  (^Integer [^IndexAccumulation this]
    (-> this (.getFinalResult))))

(defn zero-double
  "Initial value for the index accumulation

  returns: the initial value - `double`"
  (^Double [^IndexAccumulation this]
    (-> this (.zeroDouble))))

(defn zero-float
  "Initial value for the index accumulation.

  returns: the initial value - `float`"
  (^Float [^IndexAccumulation this]
    (-> this (.zeroFloat))))

(defn zero-half
  "Initial value for the index accumulation.

  returns: the initial value - `float`"
  (^Float [^IndexAccumulation this]
    (-> this (.zeroHalf))))

(defn zero-pair
  "The initial value and initial index to use
  for the accumulation

  returns: `org.nd4j.linalg.primitives.Pair<java.lang.Double,java.lang.Integer>`"
  (^org.nd4j.linalg.primitives.Pair [^IndexAccumulation this]
    (-> this (.zeroPair))))


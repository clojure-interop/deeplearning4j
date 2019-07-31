(ns org.nd4j.linalg.api.ops.Accumulation
  "An accumulation is an op that given:
 x -> the origin ndarray
 y -> the pairwise ndarray
 n -> the number of times to accumulate


 Of note here in the extra arguments.

 An accumulation (or reduction in some terminology)
 has a concept of a starting value.

 The starting value is the initialization of the solution
 to the operation.

 An accumulation should always have the extraArgs()
 contain the zero value as the first value.

 This allows the architecture to generalize to different backends
 and gives the implementer of a backend a way of hooking in to
 passing parameters to different engines.
 Note that Accumulation op implementations should be stateless
 (other than the final result and x/y/z/n arguments) and hence threadsafe,
 such that they may be parallelized using the update, combineSubResults and
 set/getFinalResults methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops Accumulation]))

(defn zero-double
  "Initial value (used to initialize the accumulation op)

  returns: the initial value - `double`"
  (^Double [^Accumulation this]
    (-> this (.zeroDouble))))

(defn get-final-result
  "Get the final result (may return null if getAndSetFinalResult has not
  been called, or for accumulation ops on complex arrays)

  returns: `java.lang.Number`"
  (^java.lang.Number [^Accumulation this]
    (-> this (.getFinalResult))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^Accumulation this]
    (-> this (.getOpType))))

(defn keep-dims?
  "This method returns TRUE if we're going to keep axis, FALSE otherwise

  returns: `boolean`"
  (^Boolean [^Accumulation this]
    (-> this (.isKeepDims))))

(defn complex-accumulation?
  "returns: `boolean`"
  (^Boolean [^Accumulation this]
    (-> this (.isComplexAccumulation))))

(defn zero-float
  "Initial value (used to initialize the accumulation op)

  returns: `float`"
  (^Float [^Accumulation this]
    (-> this (.zeroFloat))))

(defn no-op
  "Returns the no op version
  of the input
  Basically when a reduce can't happen (eg: sum(0) on a row vector)
  you have a no op state for a given reduction.
  For most accumulations, this should return x
  but certain transformations should return say: the absolute value

  returns: the no op version of the input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Accumulation this]
    (-> this (.noOp))))

(defn zero-half
  "Initial value for half

  returns: `float`"
  (^Float [^Accumulation this]
    (-> this (.zeroHalf))))

(defn set-final-result
  "Get the final result (may return null if getAndSetFinalResult has not
  been called, or for accumulation ops on complex arrays)

  value - `double`"
  ([^Accumulation this ^Double value]
    (-> this (.setFinalResult value))))


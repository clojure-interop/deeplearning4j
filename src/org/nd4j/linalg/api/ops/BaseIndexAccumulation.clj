(ns org.nd4j.linalg.api.ops.BaseIndexAccumulation
  "Index based reduction algo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops BaseIndexAccumulation]))

(defn ->base-index-accumulation
  "Constructor.

  Initialize with the given
  input, pairwise transform, result, and number
  of elements

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the result - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  (^BaseIndexAccumulation [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new BaseIndexAccumulation x y z n))
  (^BaseIndexAccumulation [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean keep-dims dimensions]
    (new BaseIndexAccumulation same-diff i-v i-v-2 keep-dims dimensions))
  (^BaseIndexAccumulation [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Long n]
    (new BaseIndexAccumulation x y n))
  (^BaseIndexAccumulation [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new BaseIndexAccumulation x y))
  (^BaseIndexAccumulation [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new BaseIndexAccumulation x))
  (^BaseIndexAccumulation []
    (new BaseIndexAccumulation )))

(defn zero-double
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `double`"
  (^Double [^BaseIndexAccumulation this]
    (-> this (.zeroDouble))))

(defn zero-float
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `float`"
  (^Float [^BaseIndexAccumulation this]
    (-> this (.zeroFloat))))

(defn zero-pair
  "Description copied from interface: IndexAccumulation

  returns: `org.nd4j.linalg.primitives.Pair<java.lang.Double,java.lang.Integer>`"
  (^org.nd4j.linalg.primitives.Pair [^BaseIndexAccumulation this]
    (-> this (.zeroPair))))

(defn init
  "Description copied from interface: Op

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  ([^BaseIndexAccumulation this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (-> this (.init x y z n))))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^BaseIndexAccumulation this]
    (-> this (.calculateOutputShape))))

(defn set-final-result
  "Description copied from interface: IndexAccumulation

  idx - `int`"
  ([^BaseIndexAccumulation this ^Integer idx]
    (-> this (.setFinalResult idx))))

(defn get-final-result
  "Description copied from interface: IndexAccumulation

  returns: `int`"
  (^Integer [^BaseIndexAccumulation this]
    (-> this (.getFinalResult))))


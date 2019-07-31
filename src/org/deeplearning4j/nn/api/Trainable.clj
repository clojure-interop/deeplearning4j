(ns org.deeplearning4j.nn.api.Trainable
  "Trainable: an interface common to Layers and GraphVertices that have trainable parameters"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.api Trainable]))

(defn get-config
  "returns: Training configuration - `org.deeplearning4j.nn.api.TrainingConfig`"
  (^org.deeplearning4j.nn.api.TrainingConfig [^Trainable this]
    (-> this (.getConfig))))

(defn num-params
  "returns: Number of parameters - `int`"
  (^Integer [^Trainable this]
    (-> this (.numParams))))

(defn params
  "returns: 1d parameter vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Trainable this]
    (-> this (.params))))

(defn param-table
  "backprop-only - If true: return only parameters that are not exclusively used for layerwise pretraining - `boolean`

  returns: Parameter table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^Trainable this ^Boolean backprop-only]
    (-> this (.paramTable backprop-only))))

(defn get-gradients-view-array
  "returns: 1D gradients view array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Trainable this]
    (-> this (.getGradientsViewArray))))


(ns org.nd4j.linalg.activations.BaseActivationFunction
  "Base IActivation for activation functions without parameters"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.activations BaseActivationFunction]))

(defn ->base-activation-function
  "Constructor."
  (^BaseActivationFunction []
    (new BaseActivationFunction )))

(defn num-params
  "input-size - `int`

  returns: `int`"
  (^Integer [^BaseActivationFunction this ^Integer input-size]
    (-> this (.numParams input-size))))

(defn set-parameters-view-array
  "view-array - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize - `boolean`"
  ([^BaseActivationFunction this ^org.nd4j.linalg.api.ndarray.INDArray view-array ^Boolean initialize]
    (-> this (.setParametersViewArray view-array initialize))))

(defn get-parameters-view-array
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseActivationFunction this]
    (-> this (.getParametersViewArray))))

(defn set-gradient-view-array
  "view-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseActivationFunction this ^org.nd4j.linalg.api.ndarray.INDArray view-array]
    (-> this (.setGradientViewArray view-array))))

(defn get-gradient-view-array
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseActivationFunction this]
    (-> this (.getGradientViewArray))))


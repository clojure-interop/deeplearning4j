(ns org.deeplearning4j.nn.params.ElementWiseParamInitializer
  "created by jingshu"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.params ElementWiseParamInitializer]))

(defn ->element-wise-param-initializer
  "Constructor."
  (^ElementWiseParamInitializer []
    (new ElementWiseParamInitializer )))

(defn *get-instance
  "returns: `org.deeplearning4j.nn.params.ElementWiseParamInitializer`"
  (^org.deeplearning4j.nn.params.ElementWiseParamInitializer []
    (ElementWiseParamInitializer/getInstance )))

(defn num-params
  "layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: `long`"
  (^Long [^ElementWiseParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.numParams layer))))

(defn init
  "Initialize the parameters

  conf - the configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  params-view - a view of the full network (backprop) parameters - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - if true: initialize the parameters according to the configuration. If false: don't modify thevalues in the paramsView array (but do select out the appropriate subset, reshape etc as required) - `boolean`

  returns: Map of parameters keyed by type (view of the 'paramsView' array) - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^ElementWiseParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean initialize-params]
    (-> this (.init conf params-view initialize-params))))

(defn get-gradients-from-flattened
  "Return a map of gradients (in their standard non-flattened representation), taken from the flattened (row vector) gradientView array.
  The idea is that operates in exactly the same way as the the paramsView does in
  thus the position in the view (and, the array orders) must match those of the parameters

  conf - Configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  gradient-view - The flattened gradients array, as a view of the larger array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A map containing an array by parameter type, that is a view of the full network gradients array - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^ElementWiseParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray gradient-view]
    (-> this (.getGradientsFromFlattened conf gradient-view))))


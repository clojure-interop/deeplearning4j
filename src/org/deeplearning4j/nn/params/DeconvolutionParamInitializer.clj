(ns org.deeplearning4j.nn.params.DeconvolutionParamInitializer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.params DeconvolutionParamInitializer]))

(defn ->deconvolution-param-initializer
  "Constructor."
  (^DeconvolutionParamInitializer []
    (new DeconvolutionParamInitializer )))

(defn *get-instance
  "returns: `org.deeplearning4j.nn.params.DeconvolutionParamInitializer`"
  (^org.deeplearning4j.nn.params.DeconvolutionParamInitializer []
    (DeconvolutionParamInitializer/getInstance )))

(defn get-gradients-from-flattened
  "Description copied from interface: ParamInitializer

  conf - Configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  gradient-view - The flattened gradients array, as a view of the larger array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A map containing an array by parameter type, that is a view of the full network gradients array - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^DeconvolutionParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray gradient-view]
    (-> this (.getGradientsFromFlattened conf gradient-view))))


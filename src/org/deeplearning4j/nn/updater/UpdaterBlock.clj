(ns org.deeplearning4j.nn.updater.UpdaterBlock
  "UpdaterBlock: used in BaseMultiLayerUpdater, this class implements updating (i.e., Adam, RMSProp, Momentum,
 etc) across multiple contiguous layers/parameters, as described in the BaseMultiLayerUpdater javadoc."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.updater UpdaterBlock]))

(defn ->updater-block
  "Constructor.

  param-offset-start - Start offset of the parameters in this block (relative to overall net paramsview array) - `int`
  param-offset-end - End offset of the parameters in this block (relative to overall net paramsview array) - `int`
  updater-view-offset-start - Start offset of the updater state array in this block (relative to overall netupdater state view array) - `int`
  updater-view-offset-end - End offset of the updater state array in this block (relative to overall netupdater state view array) - `int`
  layers-and-variables-in-block - List of layers and variables in this updater block. By definition, all layersand variables in this list must have an identical updater configuration. - `java.util.List`"
  (^UpdaterBlock [^Integer param-offset-start ^Integer param-offset-end ^Integer updater-view-offset-start ^Integer updater-view-offset-end ^java.util.List layers-and-variables-in-block]
    (new UpdaterBlock param-offset-start param-offset-end updater-view-offset-start updater-view-offset-end layers-and-variables-in-block)))

(defn init
  ""
  ([^UpdaterBlock this]
    (-> this (.init))))

(defn pretrain-updater-block?
  "returns: `boolean`"
  (^Boolean [^UpdaterBlock this]
    (-> this (.isPretrainUpdaterBlock))))

(defn skip-due-to-pretrain-config
  "returns: `boolean`"
  (^Boolean [^UpdaterBlock this]
    (-> this (.skipDueToPretrainConfig))))

(defn get-gradient-updater
  "returns: `org.nd4j.linalg.learning.GradientUpdater`"
  (^org.nd4j.linalg.learning.GradientUpdater [^UpdaterBlock this]
    (-> this (.getGradientUpdater))))

(defn update
  "Update the gradient for this block

  iteration - The current iteration (i.e., total number of parameter updates so far) - `int`
  epoch - `int`"
  ([^UpdaterBlock this ^Integer iteration ^Integer epoch]
    (-> this (.update iteration epoch))))

(defn update-external-gradient
  "iteration - `int`
  epoch - `int`
  full-network-gradient-view - `org.nd4j.linalg.api.ndarray.INDArray`
  full-network-params-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^UpdaterBlock this ^Integer iteration ^Integer epoch ^org.nd4j.linalg.api.ndarray.INDArray full-network-gradient-view ^org.nd4j.linalg.api.ndarray.INDArray full-network-params-array]
    (-> this (.updateExternalGradient iteration epoch full-network-gradient-view full-network-params-array))))

(defn post-apply
  "Apply L1 and L2 regularization, if necessary. Note that L1/L2 may differ for different layers in the same block

  layer - The layer to apply L1/L2 to - `org.deeplearning4j.nn.api.Trainable`
  param-name - Parameter name in the given layer - `java.lang.String`
  gradient-view - Gradient view array for the layer param - `org.nd4j.linalg.api.ndarray.INDArray`
  params-view - Parameter view array for the layer param - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^UpdaterBlock this ^org.deeplearning4j.nn.api.Trainable layer ^java.lang.String param-name ^org.nd4j.linalg.api.ndarray.INDArray gradient-view ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.postApply layer param-name gradient-view params-view))))


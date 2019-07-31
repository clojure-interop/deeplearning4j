(ns org.deeplearning4j.nn.layers.normalization.CudnnBatchNormalizationHelper
  "cuDNN-based helper for the batch normalization layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.normalization CudnnBatchNormalizationHelper]))

(defn ->cudnn-batch-normalization-helper
  "Constructor."
  (^CudnnBatchNormalizationHelper []
    (new CudnnBatchNormalizationHelper )))

(defn check-supported
  "eps - `double`

  returns: `boolean`"
  (^Boolean [^CudnnBatchNormalizationHelper this ^Double eps]
    (-> this (.checkSupported eps))))

(defn backprop-gradient
  "input - `org.nd4j.linalg.api.ndarray.INDArray`
  epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  shape - `int[]`
  gamma - `org.nd4j.linalg.api.ndarray.INDArray`
  d-gamma-view - `org.nd4j.linalg.api.ndarray.INDArray`
  d-beta-view - `org.nd4j.linalg.api.ndarray.INDArray`
  eps - `double`
  layer-workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^CudnnBatchNormalizationHelper this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray epsilon shape ^org.nd4j.linalg.api.ndarray.INDArray gamma ^org.nd4j.linalg.api.ndarray.INDArray d-gamma-view ^org.nd4j.linalg.api.ndarray.INDArray d-beta-view ^Double eps ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr layer-workspace-mgr]
    (-> this (.backpropGradient input epsilon shape gamma d-gamma-view d-beta-view eps layer-workspace-mgr))))

(defn pre-output
  "x - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`
  shape - `int[]`
  gamma - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `org.nd4j.linalg.api.ndarray.INDArray`
  mean - `org.nd4j.linalg.api.ndarray.INDArray`
  var - `org.nd4j.linalg.api.ndarray.INDArray`
  decay - `double`
  eps - `double`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CudnnBatchNormalizationHelper this ^org.nd4j.linalg.api.ndarray.INDArray x ^Boolean training shape ^org.nd4j.linalg.api.ndarray.INDArray gamma ^org.nd4j.linalg.api.ndarray.INDArray beta ^org.nd4j.linalg.api.ndarray.INDArray mean ^org.nd4j.linalg.api.ndarray.INDArray var ^Double decay ^Double eps ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.preOutput x training shape gamma beta mean var decay eps workspace-mgr))))

(defn helper-memory-use
  "Description copied from interface: LayerHelper

  returns: Map of memory, may be null if none is used. - `java.util.Map<java.lang.String,java.lang.Long>`"
  (^java.util.Map [^CudnnBatchNormalizationHelper this]
    (-> this (.helperMemoryUse))))


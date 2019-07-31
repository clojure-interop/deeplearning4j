(ns org.deeplearning4j.nn.layers.normalization.CudnnLocalResponseNormalizationHelper
  "cuDNN-based helper for the local response normalization layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.normalization CudnnLocalResponseNormalizationHelper]))

(defn ->cudnn-local-response-normalization-helper
  "Constructor."
  (^CudnnLocalResponseNormalizationHelper []
    (new CudnnLocalResponseNormalizationHelper )))

(defn check-supported
  "k - `double`
  n - `double`
  alpha - `double`
  beta - `double`

  returns: `boolean`"
  (^Boolean [^CudnnLocalResponseNormalizationHelper this ^Double k ^Double n ^Double alpha ^Double beta]
    (-> this (.checkSupported k n alpha beta))))

(defn backprop-gradient
  "input - `org.nd4j.linalg.api.ndarray.INDArray`
  epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  k - `double`
  n - `double`
  alpha - `double`
  beta - `double`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^CudnnLocalResponseNormalizationHelper this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^Double k ^Double n ^Double alpha ^Double beta ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient input epsilon k n alpha beta workspace-mgr))))

(defn activate
  "input - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`
  k - `double`
  n - `double`
  alpha - `double`
  beta - `double`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CudnnLocalResponseNormalizationHelper this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^Double k ^Double n ^Double alpha ^Double beta ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate input training k n alpha beta workspace-mgr))))

(defn helper-memory-use
  "Description copied from interface: LayerHelper

  returns: Map of memory, may be null if none is used. - `java.util.Map<java.lang.String,java.lang.Long>`"
  (^java.util.Map [^CudnnLocalResponseNormalizationHelper this]
    (-> this (.helperMemoryUse))))


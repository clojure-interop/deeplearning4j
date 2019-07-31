(ns org.deeplearning4j.nn.layers.normalization.LocalResponseNormalizationHelper
  "Helper for the local response normalization layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.normalization LocalResponseNormalizationHelper]))

(defn check-supported
  "k - `double`
  n - `double`
  alpha - `double`
  beta - `double`

  returns: `boolean`"
  (^Boolean [^LocalResponseNormalizationHelper this ^Double k ^Double n ^Double alpha ^Double beta]
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
  (^org.nd4j.linalg.primitives.Pair [^LocalResponseNormalizationHelper this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^Double k ^Double n ^Double alpha ^Double beta ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient input epsilon k n alpha beta workspace-mgr))))

(defn activate
  "x - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`
  k - `double`
  n - `double`
  alpha - `double`
  beta - `double`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LocalResponseNormalizationHelper this ^org.nd4j.linalg.api.ndarray.INDArray x ^Boolean training ^Double k ^Double n ^Double alpha ^Double beta ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate x training k n alpha beta workspace-mgr))))


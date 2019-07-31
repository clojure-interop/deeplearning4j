(ns org.deeplearning4j.nn.conf.weightnoise.IWeightNoise
  "IWeightNoise instances operate on an weight array(s), modifying values at training time or test
 time, before they are used. Note that the weights are copied before being modified - the original parameters
 are not changed. However, if the pameters are not changed, the original array is returned.
 This interface can be used to implement functionality like DropConnect, weight quantization and weight
 noise."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.weightnoise IWeightNoise]))

(defn get-parameter
  "Get the parameter, after applying weight noise

  layer - Layer to get the parameter for - `org.deeplearning4j.nn.api.Layer`
  param-key - Parameter key - `java.lang.String`
  iteration - Iteration number - `int`
  epoch - Epoch number - `int`
  train - If true: training. False: at test time - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Parameter, after applying weight noise - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^IWeightNoise this ^org.deeplearning4j.nn.api.Layer layer ^java.lang.String param-key ^Integer iteration ^Integer epoch ^Boolean train ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.getParameter layer param-key iteration epoch train workspace-mgr))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.weightnoise.IWeightNoise`"
  (^org.deeplearning4j.nn.conf.weightnoise.IWeightNoise [^IWeightNoise this]
    (-> this (.clone))))


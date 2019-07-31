(ns org.deeplearning4j.nn.conf.weightnoise.DropConnect
  "DropConnect, based on Wan et. al 2013 - \"Regularization of Neural Networks using DropConnect\"
 Sets weights randomly to 0 with some probability, or leaves them unchanged."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.weightnoise DropConnect]))

(defn ->drop-connect
  "Constructor.

  weight-retain-probability - Probability of retaining a weight - `double`
  apply-to-biases - If true: apply to biases (default: weights only) - `boolean`"
  (^DropConnect [^Double weight-retain-probability ^Boolean apply-to-biases]
    (new DropConnect weight-retain-probability apply-to-biases))
  (^DropConnect [^Double weight-retain-probability]
    (new DropConnect weight-retain-probability)))

(defn get-parameter
  "Description copied from interface: IWeightNoise

  layer - Layer to get the parameter for - `org.deeplearning4j.nn.api.Layer`
  param-key - Parameter key - `java.lang.String`
  iteration - Iteration number - `int`
  epoch - Epoch number - `int`
  train - If true: training. False: at test time - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Parameter, after applying weight noise - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DropConnect this ^org.deeplearning4j.nn.api.Layer layer ^java.lang.String param-key ^Integer iteration ^Integer epoch ^Boolean train ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.getParameter layer param-key iteration epoch train workspace-mgr))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.weightnoise.DropConnect`"
  (^org.deeplearning4j.nn.conf.weightnoise.DropConnect [^DropConnect this]
    (-> this (.clone))))


(ns org.deeplearning4j.nn.conf.weightnoise.WeightNoise
  "Apply noise of the specified distribution to the weights at training time.
 Note that both additive and multiplicative modes are supported - when additive, noise should be mean 0,
 when multiplicative, noise should be mean 1.
 That is, additive noise: x = x  noise
 multiplicative noise: x = x * noise"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.weightnoise WeightNoise]))

(defn ->weight-noise
  "Constructor.

  distribution - Distribution for noise - `org.deeplearning4j.nn.conf.distribution.Distribution`
  apply-to-bias - If true: apply to biases also. If false (default): apply only to weights - `boolean`
  additive - If true: noise is added to weights. If false: noise is multiplied by weights - `boolean`"
  (^WeightNoise [^org.deeplearning4j.nn.conf.distribution.Distribution distribution ^Boolean apply-to-bias ^Boolean additive]
    (new WeightNoise distribution apply-to-bias additive))
  (^WeightNoise [^org.deeplearning4j.nn.conf.distribution.Distribution distribution ^Boolean additive]
    (new WeightNoise distribution additive))
  (^WeightNoise [^org.deeplearning4j.nn.conf.distribution.Distribution distribution]
    (new WeightNoise distribution)))

(defn get-parameter
  "Description copied from interface: IWeightNoise

  layer - Layer to get the parameter for - `org.deeplearning4j.nn.api.Layer`
  param-key - Parameter key - `java.lang.String`
  iteration - Iteration number - `int`
  epoch - Epoch number - `int`
  train - If true: training. False: at test time - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Parameter, after applying weight noise - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WeightNoise this ^org.deeplearning4j.nn.api.Layer layer ^java.lang.String param-key ^Integer iteration ^Integer epoch ^Boolean train ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.getParameter layer param-key iteration epoch train workspace-mgr))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.weightnoise.WeightNoise`"
  (^org.deeplearning4j.nn.conf.weightnoise.WeightNoise [^WeightNoise this]
    (-> this (.clone))))


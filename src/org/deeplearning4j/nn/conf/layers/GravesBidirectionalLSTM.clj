(ns org.deeplearning4j.nn.conf.layers.GravesBidirectionalLSTM
  "Deprecated.
 use Bidirectional instead. With the
 Bidirectional layer wrapper you can make any recurrent layer bidirectional, in particular GravesLSTM.
 Note that this layer adds the output of both directions, which translates into \"ADD\" mode in Bidirectional.
 Usage: .layer(new Bidirectional(Bidirectional.Mode.ADD, new GravesLSTM.Builder()....build()))"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers GravesBidirectionalLSTM]))

(defn instantiate
  "Deprecated.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^GravesBidirectionalLSTM this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn initializer
  "Deprecated.

  returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^GravesBidirectionalLSTM this]
    (-> this (.initializer))))

(defn get-l-1-by-param
  "Deprecated.

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^GravesBidirectionalLSTM this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

(defn get-l-2-by-param
  "Deprecated.

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^GravesBidirectionalLSTM this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn get-memory-report
  "Deprecated.

  input-type - Input type to the layer. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the layer - `org.deeplearning4j.nn.conf.memory.LayerMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^GravesBidirectionalLSTM this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getMemoryReport input-type))))


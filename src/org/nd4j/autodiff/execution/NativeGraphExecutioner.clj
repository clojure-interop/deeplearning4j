(ns org.nd4j.autodiff.execution.NativeGraphExecutioner
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.execution NativeGraphExecutioner]))

(defn ->native-graph-executioner
  "Constructor."
  (^NativeGraphExecutioner []
    (new NativeGraphExecutioner )))

(defn *get-op-num
  "name - `java.lang.String`
  type - `org.nd4j.linalg.api.ops.Op$Type`

  returns: `long`"
  (^Long [^java.lang.String name ^org.nd4j.linalg.api.ops.Op$Type type]
    (NativeGraphExecutioner/getOpNum name type)))

(defn *get-flat-op-type
  "type - `org.nd4j.linalg.api.ops.Op$Type`

  returns: `byte`"
  (^Byte [^org.nd4j.linalg.api.ops.Op$Type type]
    (NativeGraphExecutioner/getFlatOpType type)))

(defn get-executioner-type
  "This method returns Type of this executioner

  returns: `org.nd4j.autodiff.execution.GraphExecutioner$Type`"
  (^org.nd4j.autodiff.execution.GraphExecutioner$Type [^NativeGraphExecutioner this]
    (-> this (.getExecutionerType))))

(defn execute-graph
  "This method executes given graph and returns results

  sd - `org.nd4j.autodiff.samediff.SameDiff`
  configuration - `org.nd4j.autodiff.execution.conf.ExecutorConfiguration`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^NativeGraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff sd ^org.nd4j.autodiff.execution.conf.ExecutorConfiguration configuration]
    (-> this (.executeGraph sd configuration)))
  ([^NativeGraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff sd]
    (-> this (.executeGraph sd))))

(defn reuse-graph
  "graph - `org.nd4j.autodiff.samediff.SameDiff`
  inputs - `java.util.Map`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^NativeGraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff graph ^java.util.Map inputs]
    (-> this (.reuseGraph graph inputs))))

(defn convert-to-flat-buffers
  "Description copied from interface: GraphExecutioner

  sd - `org.nd4j.autodiff.samediff.SameDiff`
  configuration - `org.nd4j.autodiff.execution.conf.ExecutorConfiguration`

  returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^NativeGraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff sd ^org.nd4j.autodiff.execution.conf.ExecutorConfiguration configuration]
    (-> this (.convertToFlatBuffers sd configuration)))
  (^java.nio.ByteBuffer [^NativeGraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff sd ^org.nd4j.autodiff.execution.conf.ExecutorConfiguration configuration ^java.util.Map intermediate]
    (-> this (.convertToFlatBuffers sd configuration intermediate))))

(defn register-graph
  "This method stores given graph for future execution

  graph - `org.nd4j.autodiff.samediff.SameDiff`

  returns: `int`"
  (^Integer [^NativeGraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff graph]
    (-> this (.registerGraph graph))))

(defn import-proto
  "Description copied from interface: GraphExecutioner

  file - `java.io.File`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^NativeGraphExecutioner this ^java.io.File file]
    (-> this (.importProto file))))


(ns org.nd4j.autodiff.execution.BasicGraphExecutioner
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.execution BasicGraphExecutioner]))

(defn ->basic-graph-executioner
  "Constructor."
  (^BasicGraphExecutioner []
    (new BasicGraphExecutioner )))

(defn get-executioner-type
  "This method returns Type of this executioner

  returns: `org.nd4j.autodiff.execution.GraphExecutioner$Type`"
  (^org.nd4j.autodiff.execution.GraphExecutioner$Type [^BasicGraphExecutioner this]
    (-> this (.getExecutionerType))))

(defn execute-graph
  "This method executes given graph and returns results

  graph - `org.nd4j.autodiff.samediff.SameDiff`
  configuration - `org.nd4j.autodiff.execution.conf.ExecutorConfiguration`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^BasicGraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff graph ^org.nd4j.autodiff.execution.conf.ExecutorConfiguration configuration]
    (-> this (.executeGraph graph configuration)))
  ([^BasicGraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff sd]
    (-> this (.executeGraph sd))))

(defn convert-to-flat-buffers
  "Description copied from interface: GraphExecutioner

  diff - `org.nd4j.autodiff.samediff.SameDiff`
  configuration - `org.nd4j.autodiff.execution.conf.ExecutorConfiguration`

  returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^BasicGraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff diff ^org.nd4j.autodiff.execution.conf.ExecutorConfiguration configuration]
    (-> this (.convertToFlatBuffers diff configuration))))

(defn reuse-graph
  "graph - `org.nd4j.autodiff.samediff.SameDiff`
  inputs - `java.util.Map`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^BasicGraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff graph ^java.util.Map inputs]
    (-> this (.reuseGraph graph inputs))))

(defn register-graph
  "This method stores given graph for future execution

  graph - `org.nd4j.autodiff.samediff.SameDiff`

  returns: `int`"
  (^Integer [^BasicGraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff graph]
    (-> this (.registerGraph graph))))

(defn import-proto
  "Description copied from interface: GraphExecutioner

  file - `java.io.File`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^BasicGraphExecutioner this ^java.io.File file]
    (-> this (.importProto file))))


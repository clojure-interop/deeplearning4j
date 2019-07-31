(ns org.nd4j.autodiff.execution.GraphExecutioner
  "This interface"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.execution GraphExecutioner]))

(defn get-executioner-type
  "This method returns Type of this executioner

  returns: `org.nd4j.autodiff.execution.GraphExecutioner$Type`"
  (^org.nd4j.autodiff.execution.GraphExecutioner$Type [^GraphExecutioner this]
    (-> this (.getExecutionerType))))

(defn execute-graph
  "This method executes given graph and returns results

  graph - `org.nd4j.autodiff.samediff.SameDiff`
  configuration - `org.nd4j.autodiff.execution.conf.ExecutorConfiguration`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^GraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff graph ^org.nd4j.autodiff.execution.conf.ExecutorConfiguration configuration]
    (-> this (.executeGraph graph configuration)))
  ([^GraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff graph]
    (-> this (.executeGraph graph))))

(defn reuse-graph
  "graph - `org.nd4j.autodiff.samediff.SameDiff`
  inputs - `java.util.Map`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^GraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff graph ^java.util.Map inputs]
    (-> this (.reuseGraph graph inputs))))

(defn convert-to-flat-buffers
  "This method converts given SameDiff instance to FlatBuffers representation

  diff - `org.nd4j.autodiff.samediff.SameDiff`
  configuration - `org.nd4j.autodiff.execution.conf.ExecutorConfiguration`

  returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^GraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff diff ^org.nd4j.autodiff.execution.conf.ExecutorConfiguration configuration]
    (-> this (.convertToFlatBuffers diff configuration))))

(defn register-graph
  "This method stores given graph for future execution

  graph - `org.nd4j.autodiff.samediff.SameDiff`

  returns: `int`"
  (^Integer [^GraphExecutioner this ^org.nd4j.autodiff.samediff.SameDiff graph]
    (-> this (.registerGraph graph))))

(defn import-proto
  "This method executes TF graph
  PLEASE NOTE: This feature is under development yet

  file - `java.io.File`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^GraphExecutioner this ^java.io.File file]
    (-> this (.importProto file))))


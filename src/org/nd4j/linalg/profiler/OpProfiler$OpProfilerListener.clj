(ns org.nd4j.linalg.profiler.OpProfiler$OpProfilerListener
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.profiler OpProfiler$OpProfilerListener]))

(defn invoke
  "op - `org.nd4j.linalg.api.ops.Op`"
  ([^OpProfiler$OpProfilerListener this ^org.nd4j.linalg.api.ops.Op op]
    (-> this (.invoke op))))


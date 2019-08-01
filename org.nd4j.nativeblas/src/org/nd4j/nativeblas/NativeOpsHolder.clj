(ns org.nd4j.nativeblas.NativeOpsHolder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas NativeOpsHolder]))

(defn *get-instance
  "returns: `org.nd4j.nativeblas.NativeOpsHolder`"
  (^org.nd4j.nativeblas.NativeOpsHolder []
    (NativeOpsHolder/getInstance )))


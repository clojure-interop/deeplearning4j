(ns org.nd4j.linalg.api.ops.CustomOpDescriptor
  "This class is simple POJO that contains basic information about CustomOp"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops CustomOpDescriptor]))

(defn ->custom-op-descriptor
  "Constructor."
  (^CustomOpDescriptor []
    (new CustomOpDescriptor )))


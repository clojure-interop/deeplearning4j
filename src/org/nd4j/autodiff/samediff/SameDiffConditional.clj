(ns org.nd4j.autodiff.samediff.SameDiffConditional
  "An interface for representing a conditional statement"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.samediff SameDiffConditional]))

(defn eval
  "context - `org.nd4j.autodiff.samediff.SameDiff`
  body - `org.nd4j.autodiff.samediff.SameDiffFunctionDefinition`
  input-vars - `org.nd4j.autodiff.samediff.SDVariable[]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiffConditional this ^org.nd4j.autodiff.samediff.SameDiff context ^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition body input-vars]
    (-> this (.eval context body input-vars))))


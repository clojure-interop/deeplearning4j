(ns org.nd4j.autodiff.samediff.impl.DefaultSameDiffConditional
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.samediff.impl DefaultSameDiffConditional]))

(defn ->default-same-diff-conditional
  "Constructor."
  (^DefaultSameDiffConditional []
    (new DefaultSameDiffConditional )))

(defn eval
  "context - `org.nd4j.autodiff.samediff.SameDiff`
  body - `org.nd4j.autodiff.samediff.SameDiffFunctionDefinition`
  input-vars - `org.nd4j.autodiff.samediff.SDVariable[]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DefaultSameDiffConditional this ^org.nd4j.autodiff.samediff.SameDiff context ^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition body input-vars]
    (-> this (.eval context body input-vars))))


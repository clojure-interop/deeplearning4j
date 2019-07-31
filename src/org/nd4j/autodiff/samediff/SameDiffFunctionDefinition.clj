(ns org.nd4j.autodiff.samediff.SameDiffFunctionDefinition
  "A function definition for samediff"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.samediff SameDiffFunctionDefinition]))

(defn define
  "same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  inputs - `java.util.Map`
  variable-inputs - `org.nd4j.autodiff.samediff.SDVariable[]`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^SameDiffFunctionDefinition this ^org.nd4j.autodiff.samediff.SameDiff same-diff ^java.util.Map inputs variable-inputs]
    (-> this (.define same-diff inputs variable-inputs))))


(ns org.nd4j.linalg.api.ops.impl.transforms.Trace
  "Matrix trace operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms Trace]))

(defn ->trace
  "Constructor.

  sd - `org.nd4j.autodiff.samediff.SameDiff`
  in - `org.nd4j.autodiff.samediff.SDVariable`"
  (^Trace [^org.nd4j.autodiff.samediff.SameDiff sd ^org.nd4j.autodiff.samediff.SDVariable in]
    (new Trace sd in))
  (^Trace []
    (new Trace )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Trace this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad-at-output - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Trace this ^java.util.List grad-at-output]
    (-> this (.doDiff grad-at-output))))


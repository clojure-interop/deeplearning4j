(ns org.datavec.api.io.labels.PathLabelGenerator
  "PathLabelGenerator: interface to infer the label of a file directly from the path of a file
 Example: /negative/file17.csv -> class \"0\"; /positive/file116.csv -> class \"1\" etc.
 Though note that the output is a writable, hence it need not be numerical.

 For use cases where multiple Writables are required (for example, networks with mixed classification/regression,
 or multiple output layers) use PathMultiLabelGenerator instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io.labels PathLabelGenerator]))

(defn get-label-for-path
  "path - `java.lang.String`

  returns: `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^PathLabelGenerator this ^java.lang.String path]
    (-> this (.getLabelForPath path))))

(defn infer-label-classes
  "If true: infer the set of possible label classes, and convert these to integer indexes. If when true, the
  returned Writables should be text writables.

  For regression use cases (or PathLabelGenerator classification instances that do their own label -> integer
  assignment), this should return false.

  returns: whether label classes should be inferred - `boolean`"
  (^Boolean [^PathLabelGenerator this]
    (-> this (.inferLabelClasses))))


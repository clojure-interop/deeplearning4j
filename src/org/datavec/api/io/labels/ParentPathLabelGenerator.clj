(ns org.datavec.api.io.labels.ParentPathLabelGenerator
  "Returns as label the base name of the parent file of the path (the directory)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io.labels ParentPathLabelGenerator]))

(defn ->parent-path-label-generator
  "Constructor."
  (^ParentPathLabelGenerator []
    (new ParentPathLabelGenerator )))

(defn get-label-for-path
  "path - `java.lang.String`

  returns: `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^ParentPathLabelGenerator this ^java.lang.String path]
    (-> this (.getLabelForPath path))))

(defn infer-label-classes
  "Description copied from interface: PathLabelGenerator

  returns: whether label classes should be inferred - `boolean`"
  (^Boolean [^ParentPathLabelGenerator this]
    (-> this (.inferLabelClasses))))


(ns org.datavec.api.io.labels.PatternPathLabelGenerator
  "Returns a label derived from the base name of the path. Splits the base name
 of the path with the given regex pattern, and returns the patternPosition'th
 element of the array."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io.labels PatternPathLabelGenerator]))

(defn ->pattern-path-label-generator
  "Constructor.

  pattern - `java.lang.String`
  pattern-position - `int`"
  (^PatternPathLabelGenerator [^java.lang.String pattern ^Integer pattern-position]
    (new PatternPathLabelGenerator pattern pattern-position))
  (^PatternPathLabelGenerator [^java.lang.String pattern]
    (new PatternPathLabelGenerator pattern)))

(defn get-label-for-path
  "path - `java.lang.String`

  returns: `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^PatternPathLabelGenerator this ^java.lang.String path]
    (-> this (.getLabelForPath path))))

(defn infer-label-classes
  "Description copied from interface: PathLabelGenerator

  returns: whether label classes should be inferred - `boolean`"
  (^Boolean [^PatternPathLabelGenerator this]
    (-> this (.inferLabelClasses))))


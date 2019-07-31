(ns org.deeplearning4j.ui.api.Style
  "Style defines things such as size of elements, an their margins.
 Subclasses/concrete implementations have additional settings specific to the type of component"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.api Style]))

(defn ->style
  "Constructor.

  b - `org.deeplearning4j.ui.api.Style$Builder`"
  (^Style [^org.deeplearning4j.ui.api.Style$Builder b]
    (new Style b)))


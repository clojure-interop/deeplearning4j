(ns org.deeplearning4j.models.sequencevectors.sequence.ShallowSequenceElement
  "This is special shallow SequenceElement implementation, that doesn't hold labels or any other custom user-defined data"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.sequence ShallowSequenceElement]))

(defn ->shallow-sequence-element
  "Constructor.

  frequency - `double`
  id - `long`"
  (^ShallowSequenceElement [^Double frequency ^Long id]
    (new ShallowSequenceElement frequency id)))

(defn get-label
  "Description copied from class: SequenceElement

  returns: `java.lang.String`"
  (^java.lang.String [^ShallowSequenceElement this]
    (-> this (.getLabel))))

(defn to-json
  "returns: `java.lang.String`"
  (^java.lang.String [^ShallowSequenceElement this]
    (-> this (.toJSON))))


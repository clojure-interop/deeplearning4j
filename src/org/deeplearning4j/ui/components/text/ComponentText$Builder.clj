(ns org.deeplearning4j.ui.components.text.ComponentText$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.text ComponentText$Builder]))

(defn ->builder
  "Constructor.

  text - `java.lang.String`
  style - `org.deeplearning4j.ui.components.text.style.StyleText`"
  (^ComponentText$Builder [^java.lang.String text ^org.deeplearning4j.ui.components.text.style.StyleText style]
    (new ComponentText$Builder text style)))

(defn build
  "returns: `org.deeplearning4j.ui.components.text.ComponentText`"
  (^org.deeplearning4j.ui.components.text.ComponentText [^ComponentText$Builder this]
    (-> this (.build))))


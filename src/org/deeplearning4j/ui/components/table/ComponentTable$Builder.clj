(ns org.deeplearning4j.ui.components.table.ComponentTable$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.table ComponentTable$Builder]))

(defn ->builder
  "Constructor.

  style - `org.deeplearning4j.ui.components.table.style.StyleTable`"
  (^ComponentTable$Builder [^org.deeplearning4j.ui.components.table.style.StyleTable style]
    (new ComponentTable$Builder style)))

(defn header
  "header - Header values for the table - `java.lang.String`

  returns: `org.deeplearning4j.ui.components.table.ComponentTable$Builder`"
  (^org.deeplearning4j.ui.components.table.ComponentTable$Builder [^ComponentTable$Builder this ^java.lang.String header]
    (-> this (.header header))))

(defn content
  "Content for the table, as 2d String[]

  content - `java.lang.String[][]`

  returns: `org.deeplearning4j.ui.components.table.ComponentTable$Builder`"
  (^org.deeplearning4j.ui.components.table.ComponentTable$Builder [^ComponentTable$Builder this content]
    (-> this (.content content))))

(defn build
  "returns: `org.deeplearning4j.ui.components.table.ComponentTable`"
  (^org.deeplearning4j.ui.components.table.ComponentTable [^ComponentTable$Builder this]
    (-> this (.build))))


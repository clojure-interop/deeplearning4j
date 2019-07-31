(ns org.deeplearning4j.ui.components.table.ComponentTable
  "Simple 2d table for text,"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.table ComponentTable]))

(defn ->component-table
  "Constructor.

  header - `java.lang.String[]`
  table - `java.lang.String[][]`
  style - `org.deeplearning4j.ui.components.table.style.StyleTable`"
  (^ComponentTable [header table ^org.deeplearning4j.ui.components.table.style.StyleTable style]
    (new ComponentTable header table style))
  (^ComponentTable [^org.deeplearning4j.ui.components.table.ComponentTable$Builder builder]
    (new ComponentTable builder))
  (^ComponentTable []
    (new ComponentTable )))

(def *-component-type
  "Static Constant.

  type: java.lang.String"
  ComponentTable/COMPONENT_TYPE)


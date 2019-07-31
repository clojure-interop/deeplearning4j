(ns org.datavec.api.transform.ui.components.RenderableComponentTable
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ui.components RenderableComponentTable]))

(defn ->renderable-component-table
  "Constructor.

  title - `java.lang.String`
  header - `java.lang.String[]`
  table - `java.lang.String[][]`"
  (^RenderableComponentTable [^java.lang.String title header table]
    (new RenderableComponentTable title header table))
  (^RenderableComponentTable [header table]
    (new RenderableComponentTable header table))
  (^RenderableComponentTable [^org.datavec.api.transform.ui.components.RenderableComponentTable$Builder builder]
    (new RenderableComponentTable builder))
  (^RenderableComponentTable []
    (new RenderableComponentTable )))

(def *-component-type
  "Static Constant.

  type: java.lang.String"
  RenderableComponentTable/COMPONENT_TYPE)


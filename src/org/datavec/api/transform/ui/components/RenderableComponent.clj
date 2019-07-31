(ns org.datavec.api.transform.ui.components.RenderableComponent
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ui.components RenderableComponent]))

(defn ->renderable-component
  "Constructor.

  component-type - `java.lang.String`"
  (^RenderableComponent [^java.lang.String component-type]
    (new RenderableComponent component-type)))


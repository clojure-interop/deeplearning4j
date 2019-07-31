(ns org.datavec.api.transform.ui.components.RenderableComponentHistogram
  "Created by Alex on 25/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ui.components RenderableComponentHistogram]))

(defn ->renderable-component-histogram
  "Constructor.

  builder - `org.datavec.api.transform.ui.components.RenderableComponentHistogram$Builder`"
  (^RenderableComponentHistogram [^org.datavec.api.transform.ui.components.RenderableComponentHistogram$Builder builder]
    (new RenderableComponentHistogram builder)))

(def *-component-type
  "Static Constant.

  type: java.lang.String"
  RenderableComponentHistogram/COMPONENT_TYPE)


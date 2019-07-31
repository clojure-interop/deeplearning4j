(ns org.deeplearning4j.ui.api.Component
  "A component is anything that can be rendered, such at charts, text or tables.
 The intended use of these components is for Java -> JavaScript interop for UIs"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.api Component]))

(defn ->component
  "Constructor.

  component-type - `java.lang.String`
  style - `org.deeplearning4j.ui.api.Style`"
  (^Component [^java.lang.String component-type ^org.deeplearning4j.ui.api.Style style]
    (new Component component-type style)))


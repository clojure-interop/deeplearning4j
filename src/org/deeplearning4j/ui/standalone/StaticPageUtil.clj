(ns org.deeplearning4j.ui.standalone.StaticPageUtil
  "Idea: Render a set of components as a single static page.
 The goal here is to provide a simple mechanism for exporting simple pages with static content (charts, etc),
 where (a) the required UI components, and (b) the data itself, is embedded in the page

 This is accomplished using a simple FreeMarker template"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.standalone StaticPageUtil]))

(defn *render-html
  "Given the specified components, render them to a stand-alone HTML page (which is returned as a String)

  components - Components to render - `java.util.Collection`

  returns: Stand-alone HTML page, as a String - `java.lang.String`"
  (^java.lang.String [^java.util.Collection components]
    (StaticPageUtil/renderHTML components)))

(defn *render-html-content
  "components - `org.deeplearning4j.ui.api.Component`

  returns: `java.lang.String`

  throws: java.lang.Exception"
  (^java.lang.String [^org.deeplearning4j.ui.api.Component components]
    (StaticPageUtil/renderHTMLContent components)))

(defn *save-html-file
  "A version of renderHTML(Component...) that exports the resulting HTML to the specified path.

  output-path - Output path - `java.lang.String`
  components - Components to render - `org.deeplearning4j.ui.api.Component`

  throws: java.io.IOException"
  ([^java.lang.String output-path ^org.deeplearning4j.ui.api.Component components]
    (StaticPageUtil/saveHTMLFile output-path components)))


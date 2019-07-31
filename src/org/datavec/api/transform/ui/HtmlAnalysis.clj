(ns org.datavec.api.transform.ui.HtmlAnalysis
  "Utilities for rendering DataAnalysis objects as HTML"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ui HtmlAnalysis]))

(defn *create-html-analysis-string
  "Render a data analysis object as a HTML file. This will produce a summary table, along charts for
  numerical columns. The contents of the HTML file are returned as a String, which should be written
  to a .html file.

  analysis - Data analysis object to render - `org.datavec.api.transform.analysis.DataAnalysis`

  returns: `java.lang.String`

  throws: java.lang.Exception"
  (^java.lang.String [^org.datavec.api.transform.analysis.DataAnalysis analysis]
    (HtmlAnalysis/createHtmlAnalysisString analysis)))

(defn *create-html-analysis-file
  "Render a data analysis object as a HTML file. This will produce a summary table, along charts for
  numerical columns

  data-analysis - Data analysis object to render - `org.datavec.api.transform.analysis.DataAnalysis`
  output - Output file (should have extension .html) - `java.io.File`

  throws: java.lang.Exception"
  ([^org.datavec.api.transform.analysis.DataAnalysis data-analysis ^java.io.File output]
    (HtmlAnalysis/createHtmlAnalysisFile data-analysis output)))


(ns org.datavec.api.transform.ui.HtmlSequencePlotting
  "A simple utility for plotting DataVec sequence data to HTML files.
 Each file contains only one sequence. Each column is plotted separately; only numerical and categorical columns are
 plotted."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ui HtmlSequencePlotting]))

(defn *create-html-sequence-plots
  "Create a HTML file with plots for the given sequence.

  title - Title of the page - `java.lang.String`
  schema - Schema for the data - `org.datavec.api.transform.schema.Schema`
  sequence - Sequence to plot - `java.util.List`

  returns: HTML file as a string - `java.lang.String`

  throws: java.lang.Exception"
  (^java.lang.String [^java.lang.String title ^org.datavec.api.transform.schema.Schema schema ^java.util.List sequence]
    (HtmlSequencePlotting/createHtmlSequencePlots title schema sequence)))

(defn *create-html-sequence-plot-file
  "Create a HTML file with plots for the given sequence and write it to a file.

  title - Title of the page - `java.lang.String`
  schema - Schema for the data - `org.datavec.api.transform.schema.Schema`
  sequence - Sequence to plot - `java.util.List`
  output - `java.io.File`

  throws: java.lang.Exception"
  ([^java.lang.String title ^org.datavec.api.transform.schema.Schema schema ^java.util.List sequence ^java.io.File output]
    (HtmlSequencePlotting/createHtmlSequencePlotFile title schema sequence output)))


(ns org.datavec.api.records.reader.impl.csv.CSVRegexRecordReader
  "A CSVRecordReader that can split
 each column into additional columns using regexs."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.csv CSVRegexRecordReader]))

(defn ->csv-regex-record-reader
  "Constructor.

  Skip lines, use delimiter, strip quotes, and parse each column with a regex

  skip-num-lines - the number of lines to skip - `int`
  delimiter - the delimiter - `java.lang.String`
  quote - the quote to strip - `java.lang.String`
  regexs - the regexs to parse columns with - `java.lang.String[]`"
  (^CSVRegexRecordReader [^Integer skip-num-lines ^java.lang.String delimiter ^java.lang.String quote regexs]
    (new CSVRegexRecordReader skip-num-lines delimiter quote regexs)))


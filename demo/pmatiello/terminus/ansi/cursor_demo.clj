(ns pmatiello.terminus.ansi.cursor-demo
  (:require [pmatiello.terminus.ansi.cursor :as cursor]))

(defn -main []
  (print "First line")
  (print (cursor/next-line 2))
  (print "Two lines from the first")
  (print (cursor/previous-line 1))
  (print "Up one line from below")
  (print (cursor/next-line 2))
  (print "This will be overwritten")
  (print (cursor/column 1))
  (print "This overwrittes something")
  (println))

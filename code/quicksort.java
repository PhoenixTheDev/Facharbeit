private List<Integer> quicksort(List<Integer> liste)
{        
  List<Integer> l = new List<Integer>();
  List<Integer> r = new List<Integer>();
  List<Integer> m = new List<Integer>();

  liste.toFirst();
  if (liste.getContent() == null)
    return liste;

  int pivot = liste.getContent();
  liste.next();
  if (liste.hasAccess())
    return liste;
        
  liste.toFirst();
  while (liste.hasAccess())
  {
    if (pivot < liste.getContent())
      r.append(liste.getContent());
    else if (pivot > liste.getContent())
      l.append(liste.getContent());
    else
      m.append(liste.getContent());
    liste.next();
  }

  List<Integer> returnListe = quicksort(l);
  returnListe.concat(m);
  returnListe.concat(quicksort(r));
  return returnListe;
}

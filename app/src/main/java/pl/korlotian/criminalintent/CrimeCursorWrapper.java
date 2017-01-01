package pl.korlotian.criminalintent;

import android.database.Cursor;
import android.database.CursorWrapper;

public class CrimeCursorWrapper extends CursorWrapper {
    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }
}

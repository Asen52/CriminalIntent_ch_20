package com.bignerdranch.android.criminalintent;

import java.util.UUID;

import android.support.v4.app.Fragment;

public class Deleted________CrimeActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
//		return new CrimeFragment();
		UUID crimeId = (UUID)getIntent()
				.getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);
				return CrimeFragment.newInstance(crimeId);
	}
	
	
	
	/*
	 * @Override protected void onCreate(Bundle savedInstanceState) {
	 * super.onCreate(savedInstanceState);
	 * setContentView(R.layout.activity_fragment);
	 * 
	 * FragmentManager fm = getSupportFragmentManager(); Fragment fragment =
	 * fm.findFragmentById(R.id.fragmentContainer); if (fragment == null) {
	 * fragment = new CrimeFragment();
	 * fm.beginTransaction().add(R.id.fragmentContainer, fragment) .commit(); }
	 * }
	 * 
	 * @Override public boolean onOptionsItemSelected(MenuItem item) { // Handle
	 * action bar item clicks here. The action bar will // automatically handle
	 * clicks on the Home/Up button, so long // as you specify a parent activity
	 * in AndroidManifest.xml. // int id = item.getItemId(); // if (id ==
	 * R.id.action_settings) { // return true; // } return
	 * super.onOptionsItemSelected(item); }
	 */
}

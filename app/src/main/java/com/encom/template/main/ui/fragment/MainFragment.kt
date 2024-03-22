package com.encom.template.main.ui.fragment



import com.encom.template.R
import com.encom.template.core.ui.BaseFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainFragment : BaseFragment(R.layout.fragment_main) {
    private lateinit var bottomNavigation: BottomNavigationView

    override fun onInitViews() {
        super.onInitViews()
        bottomNavigation = findViewByID(R.id.bottom_navigation)
    }

    override fun onInitListeners() {
        super.onInitListeners()
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_authors-> {
                    transaction(R.id.fragment_container,HomeFragment())
                    // Handle navigation
                    true
                }
                R.id.navigation_categories-> {
                    // Handle navigation
                    transaction(R.id.fragment_container,CategoryFragment())
                    true
                }
                R.id.navigation_history-> {
                    // Handle navigation
                    transaction(R.id.fragment_container,HistoryFragment())
                    true
                }
                R.id.navigation_favorites-> {
                    transaction(R.id.fragment_container,FavoritesFragment())
                    // Handle navigation
                    true
                }
                R.id.navigation_settings-> {
                    transaction(R.id.fragment_container,SettingsFragment())
                    // Handle navigation
                    true
                }
                // Handle other navigation items
                else -> false
            }
        }
    }

}